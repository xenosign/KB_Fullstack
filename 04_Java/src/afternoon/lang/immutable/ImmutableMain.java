package afternoon.lang.immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("효석");
        ImmutableUser user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        user2 = user2.setName("시완");
        System.out.println("user2 의 이름을 '시완'으로 변경");
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
}
