package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private LocalDate registeredOn;
    private int age;

    public User() {}

    public User(String firstname, String lastname, String email, LocalDate registeredOn, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.registeredOn = registeredOn;
        this.age = age;
    }

    // Getters and setters omitted for brevity

    @Override
    public String toString() {
        return firstname + " " + lastname + " (" + age + " yrs)";
    }
}
