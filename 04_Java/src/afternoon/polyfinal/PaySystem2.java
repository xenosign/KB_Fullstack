package afternoon.polyfinal;

import java.util.Scanner;

public class PaySystem2 {
    private Pay pay;
    Scanner scan = new Scanner(System.in);

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public void selectPay() {
        System.out.print("결제 옵션을 입력하세요 (1. KB 페이 / 2. 카카오페이 / 3. 네이버 페이) : ");
        int option = scan.nextInt();
        this.findPay(option);
    }

    public void findPay(int option) {
        if (option == 1) {
            KBPay kbPay = new KBPay();
            this.setPay(kbPay);
        } else if (option == 2) {
            this.setPay(new KakaoPay());
        } else if (option == 3) {
            this.setPay(new NaverPay());
        }
    }

    public void selectAmount() {
        System.out.println("결제 금액을 입력하세요 : ");
        int amount = scan.nextInt();
        this.payment(amount);
    }

    public void payment(int amount) {
        System.out.println("결제를 시작합니다!");
        pay.pay(amount);
    }
}
