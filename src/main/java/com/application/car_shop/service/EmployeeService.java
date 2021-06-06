package com.application.car_shop.service;

import com.application.car_shop.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployeesByName(String name);
    Employee getEmployeeById(long id);
    long addEmployee(Employee employee);
    void deleteEmployee(long id);
    void updateEmployee(long id, Employee employee);

}