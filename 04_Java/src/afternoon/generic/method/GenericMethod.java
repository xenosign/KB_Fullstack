package afternoon.generic.method;

public class GenericMethod {
    public static <T> T genericMethod(T t) {
        System.out.println("t = " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("t = " + t);
        return t;
    }











}
