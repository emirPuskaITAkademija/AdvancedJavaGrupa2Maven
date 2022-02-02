package one.exceptions;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
//OUTER klasa
//1. polje ili atribut...static vs instance
//2. konstruktor
//3. funkcije ili metode ...static vs instance --> writeNUmbers()

//CollectionWriter writer = new CollectionWriter();
//writer.numbers
//writer.writeNumbers();
public class CollectionWriter {
    private List<Integer> numbers;

    public CollectionWriter() {
        numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    /**
     * Treba da uzme vrijednosti iz polja numbers
     * i upiše ih u fajl
     */
    public void writeNumbers() {
        //try-catch-finnaly
        //1.7 -> try-with-resource
        try (FileWriter fileWriter = new FileWriter("output.txt");
             PrintWriter out = new PrintWriter(fileWriter);) {


            out.println("Vozdra raja");
            for (int number : numbers) {
                out.println(number);
            }
            out.close();
        } catch (FileNotFoundException e) {
            System.err.println("Ne postoji fajl sa imenom output.txt");
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
