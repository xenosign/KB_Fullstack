package afternoon.lang.wrapper;

public class PerformanceMain {
    public static void main(String[] args) {
        int max = 1_000_000_000;
        long startTime, endTime;

        long sum1 = 0;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < max; i++) {
            sum1 += i;
        }

        endTime = System.currentTimeMillis();
        long spentTime = endTime - startTime;
        System.out.println("for 문 작업에 걸린 시간 : " + spentTime + " ms");

        Long sum2 = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            sum2 += i;
        }
        endTime = System.currentTimeMillis();
        long spentTime2 = endTime - startTime;
        System.out.println("for 문 작업에 걸린 시간 : " + spentTime2 + " ms");

    }
}
