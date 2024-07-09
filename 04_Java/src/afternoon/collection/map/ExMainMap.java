package afternoon.collection.map;

import java.util.HashMap;
import java.util.Random;

public class ExMainMap {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArr = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(10) + 1;
        } // 1 - 10 까지의 정수가 10개 생성

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= intArr.length; i++) {
            map.put(i, 0);
        }

        for(int i = 0; i < intArr.length; i++) {
            int num = intArr[i];
            map.put(num, map.get(num) + 1);
        }

        System.out.println("map = " + map);
        
    }
}
