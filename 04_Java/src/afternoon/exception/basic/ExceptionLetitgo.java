package afternoon.exception.basic;

public class ExceptionLetitgo {
    public static void main(String[] args) {
        // 예외 상황 발생 시키기 1, 배열 접근
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[5]);

        System.out.println("나오나요!?");
    }
}
