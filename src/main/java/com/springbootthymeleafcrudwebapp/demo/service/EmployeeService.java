package com.springbootthymeleafcrudwebapp.demo.service;

import com.springbootthymeleafcrudwebapp.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

}
