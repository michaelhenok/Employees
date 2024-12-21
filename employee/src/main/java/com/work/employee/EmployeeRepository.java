package com.work.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE e.empSalary = (SELECT MAX(empSalary) FROM Employee WHERE departmentEntity = e.departmentEntity)")
    List<Employee> findHighestEarningEmployeesAcrossDepartments();

    @Query("SELECT e FROM Employee e WHERE e.department.depName = :depName ORDER BY e.empSalary DESC")
    List<Employee> findTop10ByEmployeeDepDepNameOrderByEmpSalaryDesc(String deptName);


}