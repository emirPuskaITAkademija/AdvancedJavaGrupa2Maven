package one.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>
 *     FileInputStream
 *     FileOutputStream
 * </p>
 *
 * <p>
 *     FileReader
 *     FileWriter
 * </p>
 * <p>
 *     LINE by LINE
 *     BufferedReader
 *     PrintWriter
 * </p>
 *
 */
public class CopyLines {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("bigFile.txt"));
            PrintWriter out = new PrintWriter("bigFileOut.txt")){
            String line;
            while((line = in.readLine())!=null){
                out.println(line);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
