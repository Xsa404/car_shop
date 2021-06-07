package com.application.car_shop.repository;

import com.application.car_shop.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository
        extends JpaRepository<Customer, Long> {

        List<Customer> findByLastNameStartingWithOrderByLastName(String name);

    }
