package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> employees = new ArrayList<>();
		
			// creating dummy employees
			employees
			.add(new Employee("Alpha", 
					"alpha@ugmail.com", 
					   "USA", "Architect"));
			employees
			.add(new Employee("Beta", 
					"beta@ugmail.com", 
					   "India", "Manager"));
			employees
			.add(new Employee("Gama", 
					"gama@ugmail.com", 
					   "Japan", "Developer"));
			employees
			.add(new Employee("Pekka", 
					"pekka@ugmail.com", 
					   "India", "Analyst"));
			employees
			.add(new Employee("Tera", 
					"tera@ugmail.com", 
					   "Romania", "Developer"));
			employees
			.add(new Employee("Byte", 
					"byte@ugmail.com", 
					   "India", "Architect"));
			employees
			.add(new Employee("Danny", 
					"danny@ugmail.com", 
					   "UK", "Architect"));
			employees
			.add(new Employee("Rahul", 
					"rahul@ugmail.com", 
					   "India", "Developer"));
			employees
			.add(new Employee("Alpha", 
					"alpha@ugmail.com", 
					   "USA", "QA"));
			employees
			.add(new Employee("June", 
					"june@ugmail.com", 
					   "China", "Architect"));
		
		employeeRepository.saveAll(employees);
	}

}
