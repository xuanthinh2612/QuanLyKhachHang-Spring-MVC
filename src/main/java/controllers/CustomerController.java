package controllers;

import customer.Customer;
import customerService.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class CustomerController {

    CustomerService customerService = new CustomerService();
    List<Customer> customerList = customerService.findAll();

    @GetMapping("show")
    public ModelAndView showAllCustomer(){
         ModelAndView modelAndView = new ModelAndView("listCustomer");
         modelAndView.addObject("customerList",customerList);
         return modelAndView;
    }

    @GetMapping("/update/{id}")
    public ModelAndView updateCustomer(@PathVariable Integer id ){
         ModelAndView modelAndView = new ModelAndView("update");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }

    @PostMapping("update/{id}")

    public ModelAndView update(@PathVariable Integer id,@RequestParam   String name, String email, String address ){

        ModelAndView modelAndView = new ModelAndView("listCustomer");

        Customer customer = new Customer(id,name,email,address);

        customerService.update(customer);
        modelAndView.addObject("customerList",customerList);
        return modelAndView;

    }

}
