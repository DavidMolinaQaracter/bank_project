package exceptions;

public class CardBlockedException extends BankException {
    public CardBlockedException() {
        super("Card blocked!");
    }
}
