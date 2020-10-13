package com.osmanco.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

@SpringBootApplication
@EnableReactiveElasticsearchRepositories
public class ElasticDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticDemoApplication.class, args);
	}
	
	
}
