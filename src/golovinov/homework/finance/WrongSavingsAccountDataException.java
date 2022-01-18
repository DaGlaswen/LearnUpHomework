package golovinov.homework.finance;

public class WrongSavingsAccountDataException extends Exception {
    public WrongSavingsAccountDataException() {
        super("Проверьте правильность параметров счета!");
    }
}
