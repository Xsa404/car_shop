package com.application.car_shop.service;

import com.application.car_shop.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomer();
    List<Customer> getCustomerByName(String name);
    Customer getCustomerById(long id);
    long addCustomer(Customer customers);
    void deleteCustomer(long id);
    void updateCustomer(long id, Customer customers);

}
