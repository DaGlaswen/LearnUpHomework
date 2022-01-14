package golovinov.homework.finance;

public class Saver extends Client {

    public Saver(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public int calcSavings(JavaBank bank, int years) {
        int savings = 0;
        int[] AddOns = new int[years];
        for (int i = 0; i < years; i++) {
            int percentFromSalary = (int)(0.15F * salary);
            AddOns[i] = percentFromSalary;
            savings += percentFromSalary;
        }
        int interest = bank.calculateCompoundInterest(years, AddOns); // Считаем капитализированные проценты
        savings += interest;
        return savings;
    }
}
