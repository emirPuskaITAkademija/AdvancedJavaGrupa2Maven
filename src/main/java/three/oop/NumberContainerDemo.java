package three.oop;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class NumberContainerDemo {
    public static void main(String[] args) {
        NumberContainer<Integer> cijeliBrojevi = new NumberContainer<>();
        cijeliBrojevi.add(23);//0
        cijeliBrojevi.add(123); //1
        cijeliBrojevi.add(1);//2 -> uklonjen
        cijeliBrojevi.add(1000);//3
        cijeliBrojevi.add(10000);//4
        cijeliBrojevi.remove(1);
        for(Integer number: cijeliBrojevi){
            System.out.println(number);
        }
    }
}
