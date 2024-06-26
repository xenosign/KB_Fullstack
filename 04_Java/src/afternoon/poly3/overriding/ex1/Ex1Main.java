package afternoon.poly3.overriding.ex1;

public class Ex1Main {
    static Animal[] animals = {new Animal(), new Dog(), new Cat(), new Duck()};


    public static void main(String[] args) {
//        Animal[] animals = { new Animal(), new Dog(), new Cat(), new Duck() };

//        for (Animal animal : animals) {
//            animalCall(animal);
//        }
        animalCall();

    }

    static void animalCall() {
        for (Animal animal : animals) {
            animal.sound();

            if (animal instanceof Duck) {
                ((Duck) animal).fly();
            }
        }

//        animal.sound();
//
//        if (animal instanceof Duck) {
//            ((Duck) animal).fly();
//        }
    }
}
