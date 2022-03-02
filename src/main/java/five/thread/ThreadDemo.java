package five.thread;

import five.dao.CustomerDao;
import five.entity.Customer;

import java.util.List;

public class ThreadDemo extends Thread{
    public static void main(String[] args) {
        System.out.println("Pozdrav raja....");
        System.out.println(Thread.currentThread().getName());
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.setName("Teodora");
        threadDemo.start();

        Runnable runnable = new HelloRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.setName("Dino");
        thread2.start();
    }

    private static void loadDBData(){
        System.out.println("DB: " + Thread.currentThread().getName());
        List<Customer> customers = new CustomerDao().getAll();
        customers.forEach(System.out::println);
    }

    @Override
    public void run() {
        loadDBData();
    }
}
