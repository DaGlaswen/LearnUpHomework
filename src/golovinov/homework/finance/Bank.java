package golovinov.homework.finance;

import java.util.Arrays;

public class Bank {

    float calculateRate(int amount, int yearsInBank) {
        float rate = 0F;
        if (amount < 100_000) {
            rate += 5F;
        } else if (amount >= 100_000 && amount <= 500_000) {
            rate += 6F;
        } else {
            rate += 7F;
        }
        if (yearsInBank >= 20) {
            rate += 0.5F;
        }
        return rate;
    }

    public int[] calculateInterest(int years, int[] investments) {
        int[] resultingPercents = new int[years]; // The array of the interest paid yearly
        int totalAmount = 0; // Currently in bank
        investments = Arrays.copyOf(investments, years);
        for (int i = 0; i < investments.length; i++) {
            totalAmount += investments[i];
            float rate = calculateRate(totalAmount, investments.length - i);
            float ratePercent = rate / 100;
            resultingPercents[i] = (int) (totalAmount * ratePercent);
        }
        return resultingPercents;
    }

    public int calculateCompoundInterest(int years, int[] investments) {
        int interest = 0; // Total interest over the years
        int totalAmount = 0; // Currently in bank
        investments = Arrays.copyOf(investments, years);
        for (int i = 0; i < investments.length; i++) {
            totalAmount += investments[i];
            float rate = calculateRate(totalAmount, investments.length - i);
            float ratePercent = rate / 100;
            interest += (int) (totalAmount * ratePercent);
            totalAmount += (int) (totalAmount * ratePercent);
        }
        return interest;
    }
}
