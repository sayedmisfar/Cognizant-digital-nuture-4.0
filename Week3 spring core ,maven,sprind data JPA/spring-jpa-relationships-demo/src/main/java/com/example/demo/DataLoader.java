package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired private StudentRepository studentRepo;
    @Autowired private DepartmentRepository deptRepo;
    @Autowired private CourseRepository courseRepo;

    @Override
    public void run(String... args) {
        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");
        deptRepo.save(cs);
        deptRepo.save(math);

        Course spring = new Course("Spring Framework");
        Course algebra = new Course("Linear Algebra");
        courseRepo.save(spring);
        courseRepo.save(algebra);

        Student alice = new Student("Alice");
        alice.setDepartment(cs);
        alice.getCourses().add(spring);
        alice.getCourses().add(algebra);

        Student bob = new Student("Bob");
        bob.setDepartment(math);
        bob.getCourses().add(algebra);

        studentRepo.save(alice);
        studentRepo.save(bob);

        System.out.println("All Students: " + studentRepo.findAll());
        System.out.println("All Departments: " + deptRepo.findAll());
        System.out.println("All Courses: " + courseRepo.findAll());
    }
}
