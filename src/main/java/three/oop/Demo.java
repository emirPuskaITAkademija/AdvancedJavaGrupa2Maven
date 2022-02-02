package three.oop;

import one.exceptions.Person;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Unesite broj:");
        String line = new Scanner(System.in).nextLine();
        int broj = Integer.parseInt(line);
        Float floatNFloat = Float.parseFloat(line);
        System.out.println(broj);



    }
}
