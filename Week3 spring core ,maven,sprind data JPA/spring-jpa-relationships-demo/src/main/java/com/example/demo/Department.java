package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Student> students = new ArrayList<>();

    public Department() {}
    public Department(String name) { this.name = name; }

    // Getters and setters omitted for brevity

    @Override
    public String toString() {
        return name;
    }
}
