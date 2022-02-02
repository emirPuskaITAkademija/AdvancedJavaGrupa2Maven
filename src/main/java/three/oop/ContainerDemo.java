package three.oop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContainerDemo {
    public static void main(String[] args) {

        //Arrays$ArrayList
        List<String> strings =Arrays.asList("Dino", "Ena", "Semra", "Bilal", "Bilal");
        //java.util.ArrayList
//                new ArrayList<>();
//        strings.add("Dino");
//        strings.add("Ena");
//        strings.add("Semra");
//        strings.add("Bilal");
//        strings.add("Bilal");
               // Arrays.asList("Dino", "Ena", "Semra", "Bilal", "Bilal");
        strings.remove("Bilal");
        strings.remove("Bilal");
        strings.forEach(System.out::println);


//        NumberContainer<Integer> personNumberContainer = new NumberContainer<>();
//        NumberContainer<Double> doubleNumberContainer = new NumberContainer<>();
//        for(Number number: personNumberContainer){
//
//        }

//
//        //Implementacija ArrayListIterator iz ArrayList
//        //LinkedListIterator
//        LinkedList<Integer> arrayList = new LinkedList<>();
//        for(Integer number: arrayList){
//            System.out.println(number);
//        }
    }
}
