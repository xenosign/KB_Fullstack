package afternoon.classs;

public class FishBreadMain {
    public static void main(String[] args) {
        FishBread fish1 = new FishBread("마라맛", "상어", 3000);
        fish1.printFishBread();

        FishBread fish2 = new FishBread();
        fish2.printFishBread();
    }
}
