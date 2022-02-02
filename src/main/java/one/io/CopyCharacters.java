package one.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * java.io
 * FileReader
 * FileWriter
 */
public class CopyCharacters {
    public static void main(String[] args) {
        try (
                FileReader in = new FileReader("file1.txt");
                FileWriter out = new FileWriter("file2.txt")
        ) {
            int podatak;
            while((podatak = in.read())!=-1){
                out.write(podatak);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
