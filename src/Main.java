import golovinov.homework.finance.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        JavaBank bank = new JavaBank();
        Saver saver = new Saver("Mark", 20, 100_000);
        Splitter splitter = new Splitter("Phil", 30, 100_000);
        int difference = compare(saver, splitter, bank, 0);
        System.out.println(difference);

        // Головинов Данил
    }

    public static int compare(Client clientA, Client clientB, JavaBank javaBank, int years) {
        try {
            return clientA.calcSavings(javaBank, years) - clientB.calcSavings(javaBank, years);
        } catch (WrongSavingsAccountDataException e) {
            Scanner yearScan;
            do {
                yearScan = new Scanner(System.in);
                System.out.println("Пожалуйста, введите срок превышающий 0! ");
                years = yearScan.nextInt();
            } while (years <= 0);
            return compare(clientA, clientB, javaBank, years);
        }
    }
}
