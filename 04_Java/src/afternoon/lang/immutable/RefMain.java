package afternoon.lang.immutable;

public class RefMain {
    public static void main(String[] args) {
        User user1 = new User("효석");
        User user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        user2.setName("시완");
        System.out.println("user2 의 이름을 '시완'으로 변경");
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);


    }
}
