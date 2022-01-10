import golovinov.homework.finance.Bank;
import golovinov.homework.finance.Client;
import golovinov.homework.finance.Saver;
import golovinov.homework.finance.Splitter;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Saver saver = new Saver("Mark", 33, 100_000);
        Splitter splitter = new Splitter("Phil", 30, 100_000);
        int difference = compare(saver, splitter, bank, 14);
        System.out.println(difference);

        // Головинов Данил
    }

    public static int compare(Client clientA, Client clientB, Bank bank, int years) {
        return clientA.calcSavings(bank, years) - clientB.calcSavings(bank, years);
    }
}
