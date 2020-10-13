package com.osmanco.elastic.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
@Document(indexName = "bank",type="account")
public class Account {
	
	@Id
	@JsonProperty("account_number")
	public Long accountNumber;
	@JsonProperty("balance")
	public Integer balance;
	@JsonProperty("firstname")
	public String firstname;
	@JsonProperty("lastname")
	public String lastname;
	@JsonProperty("age")
	public Integer age;
	@JsonProperty("gender")
	public String gender;
	@JsonProperty("address")
	public String address;
	@JsonProperty("employer")
	public String employer;
	@JsonProperty("email")
	public String email;
	@JsonProperty("city")
	public String city;
	@JsonProperty("state")
	public String state;
}
