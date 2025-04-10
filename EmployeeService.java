package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void saveEmployeeData() {
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpName("Sneha");
		employee.setEmpSalary(45000.20);
		employeeRepository.save(employee);
	}

}
