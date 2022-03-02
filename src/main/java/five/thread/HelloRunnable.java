package five.thread;

public class HelloRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Vozdra kaže thread neki...KOJI ???");
        System.out.println(Thread.currentThread().getName());
    }
}
