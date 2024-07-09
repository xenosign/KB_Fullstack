package afternoon.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ExMain {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArr = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(10) + 1;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < intArr.length; i++) {
            boolean isNotDuplicated = set.add(intArr[i]);
            if(isNotDuplicated) {
                System.out.println("중복이 아니다!");
            } else {
                System.out.println("중복이다!");
            }
        }
    }
}
