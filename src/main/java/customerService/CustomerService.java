package customerService;

import customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    static List<Customer> customerList = new ArrayList<>();

    static {

        customerList.add(new Customer(1, "thinh1", "thinh1@gamil.com", "thai binh1"));
        customerList.add(new Customer(2, "thinh2", "thinh2@gamil.com", "thai binh2"));
        customerList.add(new Customer(3, "thinh3", "thinh3@gamil.com", "thai binh3"));
        customerList.add(new Customer(4, "thinh4", "thinh4@gamil.com", "thai binh4"));
        customerList.add(new Customer(5, "thinh5", "thinh5@gamil.com", "thai binh5"));

    }


    public List<Customer> findAll() {

        return customerList;
    }

    public Customer findById(int id) {
        for (Customer c : customerList) {
            if (id == c.getId()) {
                return c;
            }
        }
        return null;
    }

    public void update(Customer customer) {

        customerList.set(customer.getId(),customer);
    }

}
