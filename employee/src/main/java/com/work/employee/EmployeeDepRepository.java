package com.work.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDepRepository extends JpaRepository<EmployeeDep, Long> {
    List<EmployeeDep> findAll();
}