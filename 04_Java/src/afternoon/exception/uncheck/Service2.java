package afternoon.exception.uncheck;

public class Service2 {
    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.callException();
            client.callException2();
        } catch (MyUnCheckException | MyCheckException e) {
            e.printStackTrace(System.out);
        }

        System.out.println("막았는가?");
    }
}
