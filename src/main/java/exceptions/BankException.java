package exceptions;
import java.time.LocalDateTime;

public class BankException extends Exception {
    private LocalDateTime timestamp;

    public BankException(String message) {
        super(message);
        this.timestamp = LocalDateTime.now();
    }
}
