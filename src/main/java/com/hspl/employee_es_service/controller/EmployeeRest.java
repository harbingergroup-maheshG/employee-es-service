package com.hspl.employee_es_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeRest {
	
//	@Autowired
//	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String storeEmployeeDetails() {
	
		return "index";
	}

}
