package six.thread;

public class Counter {
    int number = 23;

    public synchronized void increment(){
        number++;
    }

    public synchronized void decrement(){
        number--;
    }
}
