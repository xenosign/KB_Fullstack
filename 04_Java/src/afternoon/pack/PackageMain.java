package afternoon.pack;

import afternoon.pack.a.Boss;
import afternoon.pack.nouveau.Customer;

public class PackageMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        afternoon.pack.nouveau.Customer customer2 = new afternoon.pack.nouveau.Customer();

        Boss boss1 = new Boss("정필돈", 40);
        boss1.printBoss();
    }
}
