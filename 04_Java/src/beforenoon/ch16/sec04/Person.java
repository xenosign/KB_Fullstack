package beforenoon.ch16.sec04;

public class Person {
    public void action(Calculable calcuable) {
        double result = calcuable.calc(10, 4);
        System.out.println("결과: " + result);
    }
}
