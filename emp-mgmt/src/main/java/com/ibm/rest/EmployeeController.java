package com.ibm.rest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Employee;
import com.ibm.service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public void addEmp(@RequestBody Employee emp) {
		service.save(emp);
	}
	
	@GetMapping(value = "/get/{id}", produces = "application/json")
	public Employee getEmp(@PathVariable("id") int id) {
		return service.getById(id);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<Employee> getAll() {
		return service.getAll();
	}
	
	@DeleteMapping(value = "/del/{id}", produces = "application/json")
	public List<Employee> deleteEmp(@PathVariable("id") int id) { 
		service.delete(id);
		return service.getAll();
	}
	
	@GetMapping(value = "/find/{until}", produces = "application/json")
	public List<Employee> joinedUntil(@PathVariable("until") LocalDate joinUntil) {
		return service.getAllJoinedUntil(joinUntil);
	}
	
	@GetMapping(value = "/between/{start}/{end}", produces = "application/json")
	public List<Employee> joinedBetween(@PathVariable LocalDate start, @PathVariable LocalDate end) {
		return service.getAllJoinedBetwen(start, end);
	}
}
