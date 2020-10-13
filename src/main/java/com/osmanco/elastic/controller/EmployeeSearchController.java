package com.osmanco.elastic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.osmanco.elastic.model.Account;
import com.osmanco.elastic.model.Employees;
import com.osmanco.elastic.repository.AccountRepository;
import com.osmanco.elastic.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/employee")

@RestController
public class EmployeeSearchController {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private AccountRepository accountRepository;

	@GetMapping("/search")
	public Flux<Employees> allEmployees() {
		System.out.println("get all");
		return employeeRepository.findByAge(20);
	}

	@GetMapping("/age")
	public Flux<Account> allAccount(@RequestParam(required = false) Integer age) {
		System.out.println("get all");
		return accountRepository.findByAge(age);
	}
	
	@GetMapping("/state")
	public Flux<Account> state(@RequestParam(required = false) String state) {
		System.out.println("get all");
		return accountRepository.findByState(state);
	}

	@PostMapping
	public Mono<Employees> add(@RequestBody Employees employee) {
		return employeeRepository.save(employee);
	}

}
