package com.example.demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>();

    public Course() {}
    public Course(String title) { this.title = title; }

    // Getters and setters omitted for brevity

    @Override
    public String toString() {
        return title;
    }
}
