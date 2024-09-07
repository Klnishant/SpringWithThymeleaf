package com.example.thymeleaf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thymeleaf.repositories.EmployeeRepository;

@Service
public class EmployeeServices {
	
	@Autowired
	EmployeeRepository EmployeeRepository;
}
