package afternoon.poly4;

public class Tetz implements Animal, Human{
    @Override
    public void eat() {
        System.out.println("테츠가 밥처럼 제로 콜라를 마십니다!");
    }

    @Override
    public void sleep() {
        System.out.println("테츠는 술 먹으면 잘 잡니다!");
    }

    @Override
    public void think() {
        System.out.println("테츠가 수업에서 더 웃길지 고민합니다!");
    }
}
