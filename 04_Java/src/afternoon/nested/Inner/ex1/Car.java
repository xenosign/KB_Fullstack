package afternoon.nested.Inner.ex1;

public class Car {
    private String model;
    private int oilAmount;
    private Engine engine;

    public Car(String model, int oilAmount) {
        this.model = model;
        this.oilAmount = oilAmount;
        this.engine = new Engine(this);
    }

    public String getModel() {
        return model;
    }

    public int getOilAmount() {
        return oilAmount;
    }

    public void start() {
        engine.start();
        System.out.println(model + "의 주행을 시작합니다!");
    }
}


