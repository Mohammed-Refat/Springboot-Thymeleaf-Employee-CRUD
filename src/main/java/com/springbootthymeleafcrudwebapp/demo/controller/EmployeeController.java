package com.springbootthymeleafcrudwebapp.demo.controller;

import com.springbootthymeleafcrudwebapp.demo.entity.Employee;
import com.springbootthymeleafcrudwebapp.demo.service.EmployeeService;
import lombok.Getter;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listEmployees",employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){

        // create model attribute to bind form data
        Employee employee = new Employee();

        model.addAttribute("employee",employee);
        return "new_employee";
    }
}











