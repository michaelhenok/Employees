package com.work.employee;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class EmployeeDep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depId;

    private String depName;
    private String depDesc;
    private Long id;

    public EmployeeDep(String hr, String s) {
    }

    public EmployeeDep() {

    }

    public Long getId() {
        return id;
    }

}