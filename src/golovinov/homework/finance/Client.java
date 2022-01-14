package golovinov.homework.finance;

public abstract class Client {
    protected String name;
    protected int age;
    protected int salary;

    public Client(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract int calcSavings(JavaBank bank, int years);
}
