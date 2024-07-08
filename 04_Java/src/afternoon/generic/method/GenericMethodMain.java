package afternoon.generic.method;

public class GenericMethodMain {
    public static void main(String[] args) {
        Integer integer = GenericMethod.<Integer>genericMethod(10);
        Integer integer2 = GenericMethod.<Integer>numberMethod(10);
    }
}
