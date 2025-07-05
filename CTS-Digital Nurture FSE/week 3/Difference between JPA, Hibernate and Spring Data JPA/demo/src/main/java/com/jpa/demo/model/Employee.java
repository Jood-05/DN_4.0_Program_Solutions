package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String department;

    public Employee() {}

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters and Setters
    // toString()
}
