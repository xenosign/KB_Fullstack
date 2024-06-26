package afternoon.abstractt.ex;

public class Korean implements Human {
    @Override
    public void speak() {
        System.out.println("안녕하세요");
    }

    @Override
    public void eat() {
        System.out.println("한국인은 김치찌개를 먹습니다!");
    }

    @Override
    public void hello() {
        System.out.println("안녕하세요. 지금은 " + YEAR + "년 입니다!");
    }
}
