package exceptions;

public class InvalidTransactionException extends BankException {
    public InvalidTransactionException() {
        super("Invalid transaction!");
    }
}
