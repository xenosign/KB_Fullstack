package afternoon.scanner;

import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rand = (int) (Math.random() * 100);

        System.out.println(rand);

        while (true) {
            System.out.print("0 에서 99 까지의 숫자를 입력하세요 : ");
            int input = sc.nextInt();

            if (input > rand) {
                System.out.println("Down");
            } else if (input < rand) {
                System.out.println("Up");
            } else {
                System.out.println("정답입니다. 랜덤 숫자는 " + rand);
                break;
            }
        }
    }
}
