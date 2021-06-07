package com.application.car_shop.repository;

import com.application.car_shop.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

    List<Employee> findByNameStartingWithOrderByName(String name);

}
