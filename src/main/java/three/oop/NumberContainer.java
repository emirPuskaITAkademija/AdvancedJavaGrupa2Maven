package three.oop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Dvije vrste generičkih tipova:
 * <li>1. UNBOUNDED</li>
 * <li>2. BOUNDED extends GRANICA</li>
 *
 * <p>
 *     DŽokerski tipovi
 *       ?
 *       <li>1. ?  Unbounded Generic Type</li>
 *       <li>2. ? super Integer    UPPER BOUNDED</li>
 *       <li>3. ? extends Number    LOWER BOUNDED</li>
 * </p>
 */
public class NumberContainer<B extends Number> implements Iterable<B> {

    private int capacity = 0;
    private Number[] numbers = new Number[capacity];


    @Override
    public Iterator<B> iterator() {
        return new NumberIterator();
    }

    public void function(Consumer<? extends Number> action){

    }


    public boolean add(B broj){
        capacity++;
        numbers = Arrays.copyOf(numbers, capacity);
        numbers[capacity-1] = broj;
        return true;
    }

    public boolean remove(B broj){
        if(broj == null){
            for(int i = 0; i<capacity; i++){
                if(numbers[i] == null){
                    ukloniElementNaIndexu(i);
                    return true;
                }
            }
        }else{
            for(int i = 0; i<capacity; i++){
                if(numbers[i] == broj){
                    ukloniElementNaIndexu(i);
                    return true;
                }
            }
        }
        return true;
    }

    //Zadaća broj 2: Implementirati uklanjanje elementa iz naše kolekcije
    //Hint : System.arraycopy
    //Hint 2 : Arrays.copyOf
    private void ukloniElementNaIndexu(int i) {

    }

    private class NumberIterator implements Iterator<B>{

        private int nextIndex = 0;
        @Override
        public boolean hasNext() {
            return nextIndex<numbers.length;
        }

        @Override
        public B next() {
            B number = (B) numbers[nextIndex];
            nextIndex++;
            return number;
        }
    }
}
