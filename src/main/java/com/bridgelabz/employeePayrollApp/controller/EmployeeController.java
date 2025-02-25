package com.bridgelabz.employeePayrollApp.controller;

import com.bridgelabz.employeePayrollApp.model.EmployeeModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to Employee Payroll App!";
    }

    @PostMapping("/add")
    public EmployeeModel addEmployee(@RequestBody EmployeeModel employee) {
        return employee;  // Temporary response (No DB yet)
    }
}
