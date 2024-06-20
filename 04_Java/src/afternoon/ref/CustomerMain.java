package afternoon.ref;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.name = "이효석";

        Customer customer2 = null;

        System.out.println(customer2.name);

//        customer2 = customer1;
//        System.out.println(customer2.name);
//        System.out.println(customer1.name);
    }
}
