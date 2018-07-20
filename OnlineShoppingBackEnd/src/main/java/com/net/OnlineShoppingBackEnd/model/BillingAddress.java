package com.net.OnlineShoppingBackEnd.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class BillingAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="bil_seq")
	@SequenceGenerator(name="bil_seq",sequenceName="bil_seq")
	private int billingId;
	private String streetName;
	private String city;
	private int apartNo;
	private String state;
	private String country;
	private long zipcode;
	
	@OneToOne
	
	User user;

	public int getBillingId() {
		return billingId;
	}

	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getApartNo() {
		return apartNo;
	}

	public void setApartNo(int apartNo) {
		this.apartNo = apartNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
