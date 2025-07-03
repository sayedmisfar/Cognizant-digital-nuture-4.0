package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UserRepository repo;

    @Override
    public void run(String... args) {
        List<User> users = List.of(
            new User("Alice", "Smith", "alice@example.com", LocalDate.of(2022,1,10), 28),
            new User("Bob", "Brown", "bob@foo.com", LocalDate.of(2023,5,20), 35),
            new User("Charlie", "Smith", "charlie@sample.com", LocalDate.of(2021,7,15), 22),
            new User("Dave", "Johnson", "dave@foo.com", LocalDate.of(2024,3,1), 40),
            new User("Eve", "Smith", "eve@sample.com", LocalDate.of(2025,2,2), 31)
        );
        repo.saveAll(users);

        System.out.println("Containing 'li': " + repo.findByFirstnameContainingIgnoreCase("li"));
        System.out.println("Lastname Smith sorted: " + repo.findByLastname("Smith", Sort.by("firstname").ascending()));
        System.out.println("Emails start 'bob': " + repo.findByEmailStartingWith("bob"));
        System.out.println("Registered between 2022‑01‑01 & 2024‑12‑31: " +
            repo.findByRegisteredOnBetween(LocalDate.of(2022,1,1), LocalDate.of(2024,12,31)));
        System.out.println("Age > 30: " + repo.findByAgeGreaterThan(30));
        System.out.println("Age <= 30: " + repo.findByAgeLessThanEqual(30));
        System.out.println("Top 3 oldest: " + repo.findTop3ByOrderByAgeDesc());
    }
}
