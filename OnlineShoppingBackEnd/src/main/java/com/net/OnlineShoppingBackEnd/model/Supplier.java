package com.net.OnlineShoppingBackEnd.model;

import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;


import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Supplier {
	@Id

	@SequenceGenerator(name="sup_seq",sequenceName="sup_seq")
	private String supplierId;
	private String supplierName;
	private String supplierProduct;
	
	@OneToMany(mappedBy="supplier",fetch=FetchType.EAGER,cascade=CascadeType.REMOVE)
	Set<Product>product;

	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierProduct() {
		return supplierProduct;
	}
	public void setSupplierProduct(String supplierProduct) {
		this.supplierProduct = supplierProduct;
	}
	
}
