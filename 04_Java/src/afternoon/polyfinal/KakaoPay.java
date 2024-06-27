package afternoon.polyfinal;

public class KakaoPay implements Pay {
    @Override
    public void pay(int amount) {
        System.out.println("Kakao Pay 시스템과 연결합니다");
        System.out.println(amount + " 원 결제를 시도합니다");
        System.out.println("결제 성공");
    }
}
