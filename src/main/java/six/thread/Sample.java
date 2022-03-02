package six.thread;

import java.util.Arrays;
import java.util.List;

/**
 * <li>1. CPU zahtjevne operacije</li>
 * <li>2. I/O zahtjevne operacije</li>
 *
 *
 */
public class Sample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 34, 342, 34, 3445, 667, 8678, 799, 2332);
        //SUMIRANJA BROJEVA -> imperativini
        int sum = sum1(numbers);
        int sum2 = sum2(numbers);
        System.out.println("Suma svih brojeva: " + sum2);
    }

    //Martin Fowler -> collection pipeline
    static int sum2(List<Integer> numbers){
        //Stream<Integer> -> IntegerStream
       return numbers
               .stream()
               .filter(it->it%2==0)
               .map(it->2*it)
               .reduce(0, (x1, x2)->x1+x2);
    }

    static int sum1(List<Integer> numbers){
        //initial value
        int sum = 0;
        for(Integer number: numbers){
            if(number%2 == 0){
                sum = sum+(number*2);
            }
        }
        return sum;
    }

}
