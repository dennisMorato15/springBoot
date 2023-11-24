package com.firstProject.firstProjectSpringBooot.service;

import com.firstProject.firstProjectSpringBooot.model.Customer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CustomerService {
    private int customerIdCount = 1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();
    public Customer addCustomer(Customer customer){
        customer.setCustomerID(customerIdCount);
        customerList.add(customer);
        customerList.add(customer);
        customerIdCount++;
        return customer;
    }
    public List<Customer> getCustomers(){
        return customerList;
    }
     public Customer getCustomer(int customerId){
        return customerList
                .stream()
                .filter(c -> c.getCustomerID() == customerId)
                .findFirst()
                .get();
    }
    public Customer updateCustomer(int customerId, Customer customer){
        return customer;
    }
}
