package golovinov.homework.finance;

public abstract class Client {
    protected String name;
    protected int age;
    protected int salary;

    public Client(String name, int age, int salary) {
        this.name = name;
        setAge(age);
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new WrongClientDataException("age", age);
        }
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary <= 0) {
            throw new WrongClientDataException("salary", salary);
        }
        this.salary = salary;
    }

    public abstract int calcSavings(JavaBank bank, int years);
}
