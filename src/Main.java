import golovinov.homework.finance.JavaBank;
import golovinov.homework.finance.Client;
import golovinov.homework.finance.Saver;
import golovinov.homework.finance.Splitter;


public class Main {
    public static void main(String[] args) {
        JavaBank bank = new JavaBank();
        Saver saver = new Saver("Mark", 33, 100_000);
        Splitter splitter = new Splitter("Phil", 30, 100_000);
        int difference = compare(saver, splitter, bank, 14);
        System.out.println(difference);

        // Головинов Данил
    }

    public static int compare(Client clientA, Client clientB, JavaBank javaBank, int years) {
        return clientA.calcSavings(javaBank, years) - clientB.calcSavings(javaBank, years);
    }
}
