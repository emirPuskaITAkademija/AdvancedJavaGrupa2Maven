package three;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Zadaca {
    public static void main(String[] args) {
        //brojevi
        int[] numbers = {12, 34454, 2, 343, 45, 67, 88888888, 35, 5, 23};

        // i = 1
        for (int i = 1; i < numbers.length; i++) {
            // i = 1
            // j = 0, 1, 2, 3, 4, 5, 6, 7, 8
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        String numbersString = Arrays.toString(numbers);

        //ispis brojeva -> nema sortiranja ??
//        Stream<Integer> integerStream = Stream.of(numbers);
//        Consumer<Integer> consumer = System.out::println;
//        integerStream.forEach(consumer);
    }
}
