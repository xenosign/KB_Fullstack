package beforenoon.ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for(int i=0; i<=array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 크기 값 초과 접근 : " + e.getMessage());
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("데이터에 문제가 있음 : " + e.getMessage());
            }
        }
    }
}
