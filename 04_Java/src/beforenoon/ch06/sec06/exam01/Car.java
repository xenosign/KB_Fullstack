package beforenoon.ch06.sec06.exam01;

public class Car {
    String model; // null
    boolean start; // false
    int speed; // 0
}

class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("모델은 : " +  car.model);
        System.out.println("start 값은 : " +  car.start);
        System.out.println("speed 값은 : " +  car.speed);
    }
}
