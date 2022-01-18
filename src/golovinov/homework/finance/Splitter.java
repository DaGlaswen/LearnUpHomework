package golovinov.homework.finance;

public class Splitter extends Client {
    public Splitter(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public int calcSavings(JavaBank bank, int years) throws WrongSavingsAccountDataException {
        if (years <= 0) {
            throw new WrongSavingsAccountDataException();
        }
        int savings = 0;
        while (years > 0) {
            int[] arrayOfDeposits = (years >= 3) ? new int[3] : new int[years % 3];
            savings += (int)(0.3F * salary);
            arrayOfDeposits[0] = savings;
            int interest = bank.calculateCompoundInterest(arrayOfDeposits.length, arrayOfDeposits);
            savings += interest;
            years -= 3;
        }

        return savings;
    }
}
