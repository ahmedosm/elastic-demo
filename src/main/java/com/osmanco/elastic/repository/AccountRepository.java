package com.osmanco.elastic.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.osmanco.elastic.model.Account;

import reactor.core.publisher.Flux;

public interface AccountRepository extends ReactiveCrudRepository<Account, Long> {
	Flux<Account> findByAge(int age);
	
	Flux<Account> findByState(String state);
}
