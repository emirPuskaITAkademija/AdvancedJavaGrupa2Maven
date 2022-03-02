package five;

import java.util.Scanner;

/**
 * Kreirati mini programčić koji će dopustiti korisniku
 * da unese text.<p>
 * Provjeriti da li je uneseni text PALINDROM.
 * </p>
 * Primjeri palindroma:
 *   <li>ANA VOLI MILOVANA</li>
 *   <li>KUCUK</li>
 *   <li>POTOP</li>
 *   <li>Ema zakaj ni vinjaka zame</li>
 *   <li>E sine ženi se</li>
 *
 */
public class Zadaca5 {

    public static void main(String[] args) {
        System.out.println("Molim vas unesite PALINDROM");
        try(Scanner scanner = new Scanner(System.in)){
            String text = new Scanner(System.in).nextLine();
        }
    }

    static boolean isPalindrom(String input){
        String inputTemp = input.replace(" ", "");
        char[] inputCharArray = inputTemp.toCharArray();
        char[] outputCharArray = new char[inputCharArray.length];
        int j = 0;
        for(int i = inputCharArray.length-1;i>=0; i--){
            outputCharArray[j] = inputCharArray[i];
            j++;
        }
        boolean palindrom = false;
//        for(int i = 0;i<)
        return palindrom;
    }

}
