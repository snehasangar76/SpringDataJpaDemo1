package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends CrudRepository<EmployeeRepository, Integer> {

	void save(Employee employee);

}
