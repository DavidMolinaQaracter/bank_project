package exceptions;

public class InsufficientFundsException extends BankException {
    public InsufficientFundsException() {
        super("Insufficient funds!");
    }
}
