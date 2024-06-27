package afternoon.poly4;

public class TetzMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tetz tetz = new Tetz();

        animalDo(dog);
        animalDo(tetz);

        humanDo(tetz);
    }

    public static void animalDo(Animal animal) {
        System.out.println("동물 기능 테스트");
        animal.eat();
        animal.sleep();
        System.out.println("동물 기능 테스트 종료");
    }

    public static void humanDo(Human human) {
        System.out.println("사람 기능 테스트");
        human.think();
        System.out.println("사람 기능 테스트 종료");
    }















}
