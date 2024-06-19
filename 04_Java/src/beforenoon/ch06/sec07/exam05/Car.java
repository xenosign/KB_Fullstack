package beforenoon.ch06.sec07.exam05;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car() {};

    Car(String model) {
        this(model, null, 0);
    }

    Car(String model, String color) {
        this(model, color, 0);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
