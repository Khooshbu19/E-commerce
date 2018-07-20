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
public class Category {
	@Id
	@SequenceGenerator(name="cat_seq",sequenceName="cat_seq")
	private String categoryId;
	private String categoryName;
	private String categoryDescription;
	@OneToMany(mappedBy="category",fetch=FetchType.EAGER,cascade=CascadeType.REMOVE)
	private Set<Product>products;

	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	

}
