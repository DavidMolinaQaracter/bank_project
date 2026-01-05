package exceptions;

public class DuplicateAccountException extends BankException {
    public DuplicateAccountException() {
        super("There's already an account with the same account number");
    }
}
