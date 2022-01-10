package golovinov.homework.finance;

public class Saver extends Client {

    public Saver(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public int calcSavings(Bank bank, int years) {
        float percentFromSalary = 0.15F;
        int result = 0;
        int[] AddOns = new int[years];
        for (int i = 0; i < years; i++) {
            AddOns[i] = (int) (salary * percentFromSalary);
            result += salary * percentFromSalary;
        }
        int[] resultingPercents = bank.calculateInvestment(AddOns);
        for (int i = 0; i < years; i++) {
            result += resultingPercents[i];
        }
        return result;
    }
}
