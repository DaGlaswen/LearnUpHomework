package golovinov.homework.finance;

import java.sql.Array;

public class Splitter extends Client {
    public Splitter(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public int calcSavings(Bank bank, int years) {
        int savings = 0;
        while (years > 0) {
            int[] arrayOfDeposits = (years >= 3) ? new int[3] : new int[years];
            savings += 0.3F * salary;
            arrayOfDeposits[0] = (int) (savings);
            int interest = bank.calculateCompoundInterest(years, arrayOfDeposits);
            savings += interest;
            years -= 3;
        }

        return savings;
    }
}
