package afternoon.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();

        System.out.println(child.toString());
        System.out.println(child);

        String ref1 = Integer.toHexString(child.hashCode());
        String ref2 = Integer.toHexString(System.identityHashCode(child));

        System.out.println("ref1 = " + ref1);
        System.out.println("ref2 = " + ref2);

        Parent[] objects = {new Parent(), new Child()};
        Object[] objects2 = {new Parent(), new Child(), new OtherClass() };

        System.out.println(size(objects));
        System.out.println(size(objects2));
    }

    public static int size(Object[] objs) {
        return objs.length;
    }








}
