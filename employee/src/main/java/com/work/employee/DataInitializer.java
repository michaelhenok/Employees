package com.work.employee;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataInitializer {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeDepRepository employeeDepRepository;

    @PostConstruct
    public void initData() {
        // Initialize department data
        EmployeeDep dep1 = new EmployeeDep("HR", "Handles recruitment, employee relations, and company policies");
        EmployeeDep dep2 = new EmployeeDep("IT", "Manages company technology infrastructure and software development");
        EmployeeDep dep3 = new EmployeeDep("Finance", "Oversees budgeting, accounting, and financial planning");

        employeeDepRepository.saveAll(List.of(dep1, dep2, dep3));

        // Initialize employee data
        Employee emp1 = new Employee("Alice Johnson", 5500.00, dep1);
        Employee emp2 = new Employee("Bob Smith", 5500.00, dep1);
        Employee emp3 = new Employee("Carol Davis", 5300.00, dep1);
        Employee emp4 = new Employee("David Wilson", 7000.00, dep2);
        Employee emp5 = new Employee("Eve Brown", 7200.00, dep2);
        Employee emp6 = new Employee("Frank Miller", 7100.00, dep2);
        Employee emp7 = new Employee("Grace Taylor", 7300.00, dep2);
        Employee emp8 = new Employee("Henry And", 6500.00, dep3);
        Employee emp9 = new Employee("Ivy Thomas", 6700.00, dep3);
        Employee emp10 = new Employee("Jack White", 6400.00, dep3);

        employeeRepository.saveAll(List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10));
    }
}
