package one.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanDemo {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader("brojevi.txt"));){
            scanner.useLocale(Locale.US);
            double sum = 0;
            while (scanner.hasNext()){
                if(scanner.hasNextDouble()){
                    double number = scanner.nextDouble();
                    sum = sum+number;
                }else{
                    scanner.next();
                }
            }
            System.out.println("PO US lokalizaciji suma = " + sum);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
