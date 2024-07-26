package com.denniskurilov.app5;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Employee {
    @Id
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    public String getFirstName() {
        return firstName;
    }
    // Getters and setters
}