package afternoon.poly4.ex;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("강아지는 멍멍");
    }

    @Override
    public void eat() {
        System.out.println("강아지는 사료를 먹습니다!");
    }
}
