package com.example.web.emp.service;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.NoArgsConstructor;


	
	@Data
	@NoArgsConstructor 
	public class EmpVO { 
		String employeeId;
	String firstName;
	String lastName;
	String email;
	Date hireDate;
	String jobId;
	String departmentId;
	String profile;
	String managerId;
	int salary;
	MultipartFile uploadFile; }
