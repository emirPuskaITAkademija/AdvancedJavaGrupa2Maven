package three;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Zadaca {
    public static void main(String[] args) {
        //brojevi
        int[] numbers = {12, 34454, 2, 343, 45, 67, 88888888, 35, 5, 23};


        for(int i = 0; i<numbers.length-1; i++){
            boolean sortirani = true;
            if(numbers[i]>numbers[i+1]){
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }
        }
        for(int number:numbers){
            System.out.println(number);
        }
        String numbersString = Arrays.toString(numbers);

        //ispis brojeva -> nema sortiranja ??
//        Stream<Integer> integerStream = Stream.of(numbers);
//        Consumer<Integer> consumer = System.out::println;
//        integerStream.forEach(consumer);
    }
}
