package golovinov.homework.finance;

public class Client {
    protected String name;
    protected int age;
    protected int salary;

    public Client(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int calcSavings(Bank bank, int years) {
        int savings = 0;
        int[] tenPercentAddOns = new int[years];
        for (int i = 0; i < years; i++) {
            tenPercentAddOns[i] = salary / 10;
            savings += salary / 10; // Добавляем сами депозиты к результату
        }
        int interest = bank.calculateCompoundInterest(years, tenPercentAddOns); // Считаем капитализированные проценты
        savings += interest; //
        return savings;
    }
}
