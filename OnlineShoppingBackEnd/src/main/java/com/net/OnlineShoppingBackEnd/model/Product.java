package com.net.OnlineShoppingBackEnd.model;

import javax.persistence.Entity;




import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@Entity
public class Product {
	@Id
	@SequenceGenerator(name="pro_seq",sequenceName="pro_seq")
	private int productId;
	private String productName;
	private String productDescription;
	private int productPrice;
	@ManyToOne
	@JoinColumn(name="supplierId",insertable=false,nullable=false,updatable=false)
	private	Supplier supplier;
	private String supplierId;
	private String categoryId;
	@ManyToOne
	@JoinColumn(name="categoryId", insertable=false,updatable=false,nullable=false)
	private Category category;
	@Transient
	 MultipartFile image;

	
	
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	

}
