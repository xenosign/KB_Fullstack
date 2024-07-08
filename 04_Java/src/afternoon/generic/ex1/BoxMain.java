package afternoon.generic.ex1;

public class BoxMain {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");
        String string = stringBox.getValue();
        System.out.println("string = " + string);









    }
}
