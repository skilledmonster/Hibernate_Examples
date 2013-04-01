package com.skilledmonster.sakila.model;

// Generated Mar 17, 2013 7:41:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Store generated by hbm2java
 */
public class Store implements java.io.Serializable {

	private int storeId;
	private Set customers = new HashSet(0);

	public Store() {
	}
	
	public Store(int storeId) {
		this.storeId = storeId ; 
	}
	
	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public Set getCustomers() {
		return customers;
	}

	public void setCustomers(Set customers) {
		this.customers = customers;
	}


}