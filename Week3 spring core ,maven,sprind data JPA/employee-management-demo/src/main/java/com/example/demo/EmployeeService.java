package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @Transactional
    public void addEmployee(Employee employee) {
        repository.save(employee);
    }
}