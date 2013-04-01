package com.skilledmonster.sakila.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

@NamedNativeQueries({
	@NamedNativeQuery(
	name = "findCustomerByCustomerIdUsingNativeSQL",
	query = "select * from customer c where c.customer_id = :customerId",
	resultClass = Customer.class
	)
})

@javax.persistence.Entity
@Table(name="Customer")
public class Customer implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private int customerId ; 
	
	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName ;
	
	public Customer() {
		
	}

	public Customer(int customerId, String firstName, String lastName) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
}
