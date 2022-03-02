package six.thread;

import java.util.stream.IntStream;

/**
 * <li>
 * 1. CPU intensive
 * <p>
 * broj threadova <= broja jezgri procesora
 *
 * </li>
 *
 * <li>
 * 2. IO intensive
 * <p>
 * broj threadova =  1 / (1-BLOCKING_FACTOR)
 * 0<BLOCKING_FACTOR<1
 * </li>
 */
public class Sample2 {

    static int MAX = 2500;

    static double compute(double value) {
        double result = 0;
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                result = result + Math.sqrt(i * j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        long currentTimeStamp = System.currentTimeMillis();
        double result = IntStream.range(0, MAX)
                .parallel()
                .mapToDouble(n -> compute(n))
                .sum();
        long periodInSeconds = (System.currentTimeMillis() - currentTimeStamp) / 1000;
        System.out.println("Potrebno je bilo : " + periodInSeconds + " sekundi da ovaj završi");
        System.out.println("Result: " + result);
    }
}
