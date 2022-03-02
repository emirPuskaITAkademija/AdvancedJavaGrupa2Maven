package six;

import java.util.Scanner;

/**
 * Kreirati mini programčić koji će dopustiti korisniku
 * da unese text.<p>
 * Provjeriti da li je uneseni text PALINDROM.
 * </p>
 * Primjeri palindroma:
 * <li>ANA VOLI MILOVANA</li>
 * <li>KUCUK</li>
 * <li>POTOP</li>
 * <li>Ema zakaj ni vinjaka zame</li>
 * <li>E sine ženi se</li>
 */
public class Homework {
    public static void main(String[] args) {
        Thread singleThread = Thread.currentThread();
        System.out.println(singleThread.getName());
        System.out.println("Unesite palindrom:");
        try (Scanner scanner = new Scanner(System.in);) {
            String text = scanner.nextLine();
            PalindromChecker palindromChecker = new PalindromChecker();
            boolean palindrom = palindromChecker.isPalindromBilal(text);
            String poruka = palindrom ? "Ovo jeste palindrom" : "Ovo nije palindrom";
            System.out.println(poruka);
        }
    }
}
