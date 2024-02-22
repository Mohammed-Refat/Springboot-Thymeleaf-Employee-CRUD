package com.springbootthymeleafcrudwebapp.demo.service;


import com.springbootthymeleafcrudwebapp.demo.entity.Employee;
import com.springbootthymeleafcrudwebapp.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {

        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee =null;
        if (optional.isPresent()){
            employee = optional.get();
        }
        else {
            throw new RuntimeException(" Employee not found for id -> " + id);
        }

        return employee;
    }
}














