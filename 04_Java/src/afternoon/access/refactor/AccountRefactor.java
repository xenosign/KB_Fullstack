package afternoon.access.refactor;

public class AccountRefactor {
    public String bank;
    String grade;
    private String name;
    private int balance;

    public AccountRefactor(String bank, String grade, String name, int balance) {
        this.bank = bank;
        this.grade = grade;
        this.name = name;
        this.balance = balance;
    }
}
