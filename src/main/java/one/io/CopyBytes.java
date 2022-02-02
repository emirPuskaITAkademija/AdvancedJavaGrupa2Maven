package one.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <li>1. pročitati sadržaj/podatke  iz fajl1.txt
 * <li>2. čuvamo podatke u Java programu</li>
 * <li>3. pišemo podatke iz Java programa u fajl2.txt</li>
 *
 * <p>
 * java.io
 * FileInputStream in
 * FileOutputStream out
 * </p>
 */
public class CopyBytes {
    public static void main(String[] args) {
        //try-with-resource  catch

        try (
                FileInputStream in = new FileInputStream("fajl1.txt");
                FileOutputStream out = new FileOutputStream("output.txt");
        ) {
            int bytePodatka;
            while ((bytePodatka = in.read()) != -1) {
                out.write(bytePodatka);
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
