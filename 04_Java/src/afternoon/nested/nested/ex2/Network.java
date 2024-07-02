package afternoon.nested.nested.ex2;

import java.util.Random;

public class Network {
    private boolean networkCondition;

    public boolean checkNetwork() {
        System.out.println("네트워크 상태를 점검합니다");
        Random rand = new Random();
        networkCondition = rand.nextBoolean();
        if (networkCondition) {
            System.out.println("네트워크 상태 정상");
            return true;
        } else {
            System.out.println("네트워크 상태 비정상");
            return false;
        }
    }

    public void sendMsg(String msg) {
        NetworkMsg networkMsg = new NetworkMsg(msg);
        networkMsg.send();
    }

    private class NetworkMsg {
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
}
