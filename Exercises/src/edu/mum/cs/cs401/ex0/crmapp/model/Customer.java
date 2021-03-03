package edu.mum.cs.cs401.ex0.crmapp.model;

import java.time.LocalDate;

public class Customer {
	
	private Long customerId;
	private String name;
	private LocalDate dateOfBirth;
	
	public Customer() {}
	
	public Customer(Long customerId, LocalDate dateOfBirth) {
		this.customerId = customerId;
		this.dateOfBirth = dateOfBirth;
	}
	public Customer(Long customerId, String name, LocalDate dateOfBirth) {
		
		this.customerId = customerId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return customerId + "," + name + "," + dateOfBirth;
				//"Customer [customerId=" + customerId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	

}
