package six.thread;

public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        System.out.println("Vozdra kaže thread: " + Thread.currentThread().getName());
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.setName("Teodora");
        threadDemo.start();
        HalloThread runnable = new HalloThread();
        new Thread(runnable).start();
    }

    @Override
    public void run(){
        System.out.println("Hello say thread: " + Thread.currentThread().getName());
    }
}
