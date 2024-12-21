package com.work.employee;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EmployeeDepId implements Serializable {
    private Long depId;
    private Long employeeId;
}
