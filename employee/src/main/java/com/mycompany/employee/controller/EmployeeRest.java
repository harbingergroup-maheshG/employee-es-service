package com.mycompany.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.employee.service.EmployeeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class EmployeeRest {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public String storeEmployeeDetails() {
	
		return "";
	}

}
