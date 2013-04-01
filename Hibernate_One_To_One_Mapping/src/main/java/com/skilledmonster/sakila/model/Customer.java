package com.skilledmonster.sakila.model;

import java.io.Serializable;

public class Customer implements Serializable {

	private int customerId;
	private String firstName;
	private String lastName;
	
	private CustomerAdditionalDetail customerAdditionalDetail;
	
	private Store store ;

	

	public Customer() {

	}

	public CustomerAdditionalDetail getCustomerAdditionalDetail() {
		return customerAdditionalDetail;
	}

	public void setCustomerAdditionalDetail(
			CustomerAdditionalDetail customerAdditionalDetail) {
		this.customerAdditionalDetail = customerAdditionalDetail;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}

}
