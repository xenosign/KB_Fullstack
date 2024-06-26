package beforenoon.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length(); // 12째 줄에서 null 을 전달하여, null.length 가 실행되어 NullPointException 발생
        System.out.println("문자 수: " + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // null 을 printLength 전달하여 에러 유발
        System.out.println("[프로그램 종료]");
    }
}
