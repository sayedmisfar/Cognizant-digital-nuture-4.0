package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        EmployeeService springService = context.getBean(EmployeeService.class);
        springService.addEmployee(new Employee("John Spring", "IT"));

        HibernateService hibernateService = new HibernateService();
        hibernateService.addEmployee(new Employee("Jane Hibernate", "HR"));
    }
}