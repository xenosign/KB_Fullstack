package afternoon.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(100);
        account.deposit(100);
        account.getBalance();
        account.deposit(-100);
        account.withdraw(100);
        account.withdraw(-30);
        account.withdraw(1000);
        account.getBalance();
    }
}
