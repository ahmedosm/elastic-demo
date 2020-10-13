package com.osmanco.elastic.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Data
@Document(indexName = "lol")
public class Employees {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String designation;
	private String salary;
	private Date dateOfJoining;
	private String address;
	private String gender;
	private Integer age;
	private String maritalStatus;
	private String interests;

}
