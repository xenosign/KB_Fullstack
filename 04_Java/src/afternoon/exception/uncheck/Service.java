package afternoon.exception.uncheck;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.callException();
            client.callException2();
        } catch (MyUnCheckException e) {
            e.printStackTrace(System.out);
        } catch (MyCheckException e) {
            e.printStackTrace(System.out);
        }


        System.out.println("막았는가?");
    }
}
