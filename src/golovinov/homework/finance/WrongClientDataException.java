package golovinov.homework.finance;

public class WrongClientDataException extends RuntimeException {
    public WrongClientDataException(String variableName, int wrongData) {
        super("Величина " + variableName + " должна быть больше 0! Вы ввели величину, равную " + wrongData);
    }
}
