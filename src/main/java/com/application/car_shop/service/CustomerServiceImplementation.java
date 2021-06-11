package com.application.car_shop.service;

import com.application.car_shop.exception.RecordNotFound;
import com.application.car_shop.model.Customer;
import com.application.car_shop.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService {

    final
    CustomerRepository customerRepository;

    public CustomerServiceImplementation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getCustomerByName(String name) {
        if (name == null || name.isEmpty())
            return customerRepository.findAll();
        else
            return customerRepository.findByLastNameStartingWithOrderByLastName(name);
    }

    @Override
    public Customer getCustomerById(long id) {
        if (customerRepository.existsById(id)) {
            return customerRepository.findById(id).get();
        } else {
            throw new RecordNotFound();
        }
    }

    @Override
    public long addCustomer(Customer customer) {
        Customer newCustomer = customerRepository.save(customer);
        return newCustomer.getId();
    }

    @Override
    public void deleteCustomer(long id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        } else {
            throw new RecordNotFound();
        }
    }

    @Override
    public void updateCustomer(long id, Customer customer) {
        if (customerRepository.existsById(id)) {
            Customer existingCustomer = customerRepository.findById(id).get();
            existingCustomer.setFirstName(customer.getFirstName());
            existingCustomer.setLastname(customer.getLastname());
            existingCustomer.setResidence(customer.getResidence());
            existingCustomer.setPhoneNumber(customer.getPhoneNumber());
            customerRepository.save(existingCustomer);
        } else {
            throw new RecordNotFound();
        }
    }
}
