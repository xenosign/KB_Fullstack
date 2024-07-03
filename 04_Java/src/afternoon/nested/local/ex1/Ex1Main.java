package afternoon.nested.local.ex1;

import java.util.Random;

public class Ex1Main {
    public static void helloDice() {
        System.out.println("프로그램 시작");
        
        // 코드 덩어리 시작
        int rand = new Random().nextInt(6) + 1;
        System.out.println("주사위의 값은 : " + rand);
        // 코드 덩어리 종료

        System.out.println("프로그램 종료");
    }

    public static void helloDiceSum() {
        System.out.println("프로그램 시작");

        // 코드 덩어리 시작
        int rand1 = new Random().nextInt(6) + 1;
        int rand2 = new Random().nextInt(6) + 1;
        int sum = rand1 + rand2;
        System.out.println("주사위를 두 번 굴린 값의 합은 : " + sum);
        // 코드 덩어리 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloDice();
        helloDiceSum();
    }



}
