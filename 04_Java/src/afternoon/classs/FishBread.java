package afternoon.classs;

import java.util.Date;

public class FishBread {
    String taste = "팥";
    String shape = "붕어";
    int price = 500;
    Date makeTime = new Date();

    FishBread() {};

    FishBread(String taste, String shape, int price) {
        this.taste = taste;
        this.shape = shape;
        this.price = price;
    }

    void printFishBread() {
        System.out.println("붕어빵의 맛은!? : " + this.taste);
        System.out.println("붕어빵의 모양은?!? : " + this.shape);
        System.out.println("붕어빵의 가격은!? : " + this.price);
        System.out.println("붕어빵의 제조 시간은!? : " + this.makeTime);
    }
}

