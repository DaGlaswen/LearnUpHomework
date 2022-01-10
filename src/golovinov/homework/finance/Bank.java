package golovinov.homework.finance;

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

    public int[] calculateInvestment(int[] investments) {
        int[] resultingPercents = new int[investments.length];
        int totalAmount = 0;
        for (int i = 0; i < investments.length; i++) {
            float rate = calculateRate(investments[i], investments.length - i);
            float ratePercent = rate / 100;
            resultingPercents[i] = (int) ((totalAmount + investments[i]) * ratePercent);
            totalAmount += investments[i] + resultingPercents[i];
        }
        return resultingPercents;
    }
}
