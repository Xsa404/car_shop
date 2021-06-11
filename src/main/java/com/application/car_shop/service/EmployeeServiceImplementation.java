package com.application.car_shop.service;

import com.application.car_shop.exception.RecordNotFound;
import com.application.car_shop.model.Employee;
import com.application.car_shop.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    final
    EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        if (name == null || name.isEmpty())
            return employeeRepository.findAll();
        else
            return employeeRepository.findByNameStartingWithOrderByName(name);
    }

    @Override
    public Employee getEmployeeById(long id) {
        if (employeeRepository.existsById(id)) {
            return employeeRepository.findById(id).get();
        }
        else {
            throw new RecordNotFound();
        }
    }

    @Override
    public long addEmployee(Employee employee) {
        Employee newEmployee = employeeRepository.save(employee);
        return newEmployee.getId();
    }

    @Override
    public void deleteEmployee(long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
        }
        else {
            throw new RecordNotFound();
        }
    }

    @Override
    public void updateEmployee(long id, Employee employee) {
        if (employeeRepository.existsById(id)) {
            Employee existingEmployee = employeeRepository.findById(id).get();
            existingEmployee.setId(employee.getId());
            existingEmployee.setJob(employee.getJob());
            existingEmployee.setName(employee.getName());
            existingEmployee.setEmployeeNumber(employee.getEmployeeNumber());
            employeeRepository.save(existingEmployee);
        } else {
            throw new RecordNotFound();
        }
    }
}
