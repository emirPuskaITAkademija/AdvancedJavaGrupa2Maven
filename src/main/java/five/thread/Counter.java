package five.thread;

public class Counter {
    private int number = 23;

    public synchronized void increment(){
        number++;
    }

    public synchronized void decrement(){
        number--;
    }
}
