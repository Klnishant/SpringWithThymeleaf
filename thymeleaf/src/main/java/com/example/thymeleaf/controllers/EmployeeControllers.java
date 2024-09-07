package com.example.thymeleaf.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.thymeleaf.models.Employee;

@RestController
public class EmployeeControllers {
	
	@GetMapping("/getform")
	public ModelAndView getRegistrationForm() {
		String viewName = "register";
		Map<String,Object> model = new HashMap<>();
		Employee e = new Employee();
		
		e.setFirstname("Nishant");
		e.setLastname("Kaushal");
		
		model.put("formEntry", e);
		
		return new ModelAndView(viewName,model);
	}
}
