package com.skilledmonster.sakila.model;

// Generated Mar 17, 2013 7:41:54 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * Payment generated by hbm2java
 */
public class Payment implements java.io.Serializable {

	private Short paymentId;
	private Staff staff;
	private Customer customer;
	private Rental rental;
	private BigDecimal amount;
	private Date paymentDate;
	private Date lastUpdate;

	public Payment() {
	}

	public Payment(Staff staff, Customer customer, BigDecimal amount,
			Date paymentDate, Date lastUpdate) {
		this.staff = staff;
		this.customer = customer;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.lastUpdate = lastUpdate;
	}

	public Payment(Staff staff, Customer customer, Rental rental,
			BigDecimal amount, Date paymentDate, Date lastUpdate) {
		this.staff = staff;
		this.customer = customer;
		this.rental = rental;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.lastUpdate = lastUpdate;
	}

	public Short getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Short paymentId) {
		this.paymentId = paymentId;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Rental getRental() {
		return this.rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
