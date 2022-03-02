package six.thread;

public class HalloThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hallo, wie gehts sagen thread: " + Thread.currentThread().getName());
    }
}
