package afternoon.access.ex;

public class Speaker {
    private int volume;
    private int MAX_VOLUME = 100;
    private int MIN_VOLUME = 0;

    public Speaker() {
        this.volume = 20;
    }

    public void volumeUp() {
        if (this.volume < MAX_VOLUME) {
            this.volume++;
        } else {
            printLimit();
        }
    }

    public void volumeDown() {
        if (this.volume > MIN_VOLUME) {
            this.volume--;
        } else {
            printLimit();
        }
    }
    
    public void mute() {
        this.volume = 0;
        System.out.println("스피커가 Mute 되었습니다");
    }

    private void printLimit() {
        System.out.println("더 이상 볼륨 조절이 불가능합니다!");
    }
}
