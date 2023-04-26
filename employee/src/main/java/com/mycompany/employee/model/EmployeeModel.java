package com.mycompany.employee.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.mycompany.employee.entity.Task;

@Document(indexName = "employee")
public class EmployeeModel {
	
	@Id
	private String employeeId;
	private String name;
	private List<Task> task;
	
}
