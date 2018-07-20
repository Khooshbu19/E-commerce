package com.net.OnlineShoppingBackEnd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
	@Entity
	@Table(name="C_User")
	public class User implements Serializable {
	private static final long serialVersionUID= 3607187884251752653L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user_seq")
	@SequenceGenerator(name="user_seq",sequenceName="user_seq")
	private int u_userid;
	@Column(unique = true)
	private String u_firstname;
	private String u_lastname;
	private String email;
	private String u_password; 
	
	boolean status=true;
	private long mobile_no;
	@OneToOne
	@JoinColumn(name="shippingId")
	ShippingAddress shippingAddress;
	
	@OneToOne
	@JoinColumn(name="billingId")
	BillingAddress billingAddress;

	public int getU_userid() {
		return u_userid;
	}

	public void setU_userid(int u_userid) {
		this.u_userid = u_userid;
	}

	public String getU_firstname() {
		return u_firstname;
	}

	public void setU_firstname(String u_firstname) {
		this.u_firstname = u_firstname;
	}

	public String getU_lastname() {
		return u_lastname;
	}

	public void setU_lastname(String u_lastname) {
		this.u_lastname = u_lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
		
	
	
	}
