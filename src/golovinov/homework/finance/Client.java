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
        int result = 0;
        int[] tenPercentAddOns = new int[years];
        for (int i = 0; i < years; i++) {
            tenPercentAddOns[i] = salary / 10;
            result += salary / 10;
        }
        int[] resultingPercents = bank.calculateInvestment(tenPercentAddOns);
        for (int i = 0; i < years; i++) {
            result += resultingPercents[i];
        }
        return result;
    }
}
