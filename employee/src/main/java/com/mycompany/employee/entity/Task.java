package com.mycompany.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int taskId;
	@ManyToOne
	private Employee employee;
	private String taskName;
	
}
