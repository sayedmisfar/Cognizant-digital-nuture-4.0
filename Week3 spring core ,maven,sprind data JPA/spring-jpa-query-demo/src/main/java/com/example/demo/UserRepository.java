package com.example.demo;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFirstnameContainingIgnoreCase(String infix);
    List<User> findByLastname(String lastname, Sort sort);
    List<User> findByEmailStartingWith(String prefix);
    List<User> findByRegisteredOnBetween(LocalDate start, LocalDate end);
    List<User> findByAgeGreaterThan(int minAge);
    List<User> findByAgeLessThanEqual(int maxAge);
    List<User> findTop3ByOrderByAgeDesc();
}
