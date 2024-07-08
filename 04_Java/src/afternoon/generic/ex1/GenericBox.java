package afternoon.generic.ex1;

public class GenericBox<Type> {
    private Type value;


    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }
}
