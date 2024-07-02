package afternoon.nested.nested.ex1;

public class NetworkMsg {
    private String msg;

    public NetworkMsg(String msg) {
        this.msg = msg;
    }
    
    public void send() {
        System.out.println("네트워크 메세지를 전송합니다");
        System.out.println(this.msg);
        System.out.println("네트워크 메세지 전송 종료");
    }
}
