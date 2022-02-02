package one.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * LOše stvari se dešavaju u našem programu bez obzira na to
 * koliko mi fenomenalan programer bili.
 *
 * <p>
 *     Detektujemo i obradimo greške ili loše stvari
 * </p>
 *
 * LOŠA STVAR ???
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Dobro došli na AJP");
        int number = 23;
        int[] numbers = new int[6];
        numbers[0] = 23;
        numbers[5] = 13;//ArrayIndexOutOfBoundException
        //Exceptional Event koji je prekinuo normalan tok izvršavanja mog programa
        System.out.println("Ovo je prava stvar");
        Person p1 = null;
        printPerson(p1);
        System.out.println("Ovo je druga prava stvar");
        System.out.println("Unesi ime fajla");
        String filename = new Scanner(System.in).nextLine();
        //PROVJERAVANI try-catch-finnaly
        try{
            readFile(filename);
        }catch(FileNotFoundException fileNotFoundException){
            System.err.println("Ne postoji file " + fileNotFoundException.getMessage());
        }finally {
            //ZATVARAMO
        }
    }

    private static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        if(file.exists()){
            //čitamo fajl
        }else{
            throw new FileNotFoundException();
        }
        //ČITA FAJL sa imenom filename
    }

    private static void printPerson(Person person){
        System.out.println(person.getName());//NullPointerException
    }
}
