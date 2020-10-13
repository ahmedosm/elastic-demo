package com.osmanco.elastic.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.osmanco.elastic.model.Employees;

import reactor.core.publisher.Flux;

@Repository
public interface EmployeeRepository extends ReactiveCrudRepository<Employees, String> {

	Flux<Employees> findByAge(int age);
}
