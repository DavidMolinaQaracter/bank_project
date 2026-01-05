package exceptions;

public class AuthenticationFailedException extends BankException {
    public AuthenticationFailedException() {
        super("Authentication failed");
    }
}
