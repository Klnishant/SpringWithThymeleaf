package com.example.thymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.thymeleaf.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
