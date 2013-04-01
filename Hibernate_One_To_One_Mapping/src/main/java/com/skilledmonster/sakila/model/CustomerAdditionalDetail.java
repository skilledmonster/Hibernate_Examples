package com.skilledmonster.sakila.model;

import java.io.Serializable;

public class CustomerAdditionalDetail implements Serializable {
	
	private int customerId ; 
	private String emailAddress;
	private String termsAndConditions ;
	
	private Customer customer ;
	
	public CustomerAdditionalDetail() {
		
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(String termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}
	
}
