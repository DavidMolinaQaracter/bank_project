public class Account {

    private Customer customer;
    private int accountId;
    private double balance;
    private AccountType type;
    private Status status;

    public Account(Customer c, int accId, AccountType type, Status s) {
        this.customer = c;
        this.accountId = accId;
        this.balance = 0;
        this.type = type;
        this.status = s;
    }


}
