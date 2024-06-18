package afternoon.scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요.(종료는 exit 입력) : ");
            String input = sc.nextLine();

            if(input.equals("exit")) {
                System.out.println("프로그램을 종료합니다!");
                break;
            }

            System.out.println("입력한 문자열은 : " + input);
        }
    }
}
