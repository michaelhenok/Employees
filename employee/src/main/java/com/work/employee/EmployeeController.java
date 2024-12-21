package com.work.employee;

import com.work.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/top10/{deptName}")
    public List<Employee> getTop10EarningEmployees(@PathVariable String deptName) {
        return employeeService.getTop10EarningEmployees(deptName);
    }

    @GetMapping("/highest-earning")
    public List<Employee> getHighestEarningEmployeesAcrossDepartments() {
        return employeeService.getHighestEarningEmployeesAcrossDepartments();
    }
}