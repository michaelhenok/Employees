package com.work.employee;

import com.work.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getTop10EarningEmployees(String deptName) {
        return employeeRepository.findTop10ByEmployeeDepDepNameOrderByEmpSalaryDesc(deptName);
    }

    public List<Employee> getHighestEarningEmployeesAcrossDepartments() {
        return employeeRepository.findHighestEarningEmployeesAcrossDepartments();
    }
}