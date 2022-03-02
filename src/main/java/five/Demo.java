package five;

import five.dao.CustomerDao;
import five.dao.Dao;
import five.entity.Customer;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Dao<Customer> customerDao = new CustomerDao();
        //getAll
        List<Customer> customers = customerDao.getAll();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println();
        System.out.println("BAŠKA Babaru kao mog zlatnog kupca želim dohvatiti iz baze...");
        //get(id)
        Customer customer = customerDao.get(1);
        System.out.println(customer);
    }
}
