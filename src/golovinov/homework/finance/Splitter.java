package golovinov.homework.finance;

import java.sql.Array;

public class Splitter extends Client {
    public Splitter(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public int calcSavings(Bank bank, int years) {
        int result = 0;
        while (years > 0) {
            int[] arrayOfDeposits = (years >= 3) ? new int[3] : new int[years];
            arrayOfDeposits[0] = (int) (0.3F * salary + result);
            result += 0.3F * salary;
            int[] resultingPercents = bank.calculateInvestment(arrayOfDeposits);
            for (int percents : resultingPercents) {
                result += percents;
            }
            years -= 3;
        }

        return result;
    }
}