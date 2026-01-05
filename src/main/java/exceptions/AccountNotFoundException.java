package exceptions;

public class AccountNotFoundException extends BankException {
    public AccountNotFoundException() {
        super("Account not found!");
    }
}
