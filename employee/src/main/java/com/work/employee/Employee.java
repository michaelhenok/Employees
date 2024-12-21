package com.work.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates primary key values
    private Long empId;

    private String name;
    private String department;

    // Default constructor required by JPA
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Employee(String name, double salary, EmployeeDep department) {
    }

    // Getters and Setters
    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}