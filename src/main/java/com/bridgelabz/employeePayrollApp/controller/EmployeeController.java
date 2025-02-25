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

    @GetMapping("/get/{id}")
    public String getEmployeeById(@PathVariable Long id) {
        return "Fetching employee with ID: " + id;
    }

    @PostMapping("/create")
    public String createEmployee() {
        return "Creating new employee!";
    }

    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable Long id) {
        return "Updating employee with ID: " + id;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return "Deleting employee with ID: " + id;
    }
}
