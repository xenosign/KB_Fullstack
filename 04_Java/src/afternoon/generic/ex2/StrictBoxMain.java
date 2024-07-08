package afternoon.generic.ex2;

public class StrictBoxMain {
    public static void main(String[] args) {
        StrictGenericBox<Integer> integerStrictGenericBox = new StrictGenericBox<>();
        integerStrictGenericBox.setValue(10);

        StrictGenericBox<Double> doubleStrictGenericBox = new StrictGenericBox<>();
        doubleStrictGenericBox.setValue(10.0);
    }
}
