package com.net.OnlineShoppingBackEnd.dao;

import java.util.List;

import com.net.OnlineShoppingBackEnd.model.Product;



public interface ProductDao {
	boolean addProduct(Product product);
	public List<Product> getProducts();
	public Product getProduct(int productId);
	public void deleteProduct(int productId);
	public void updateproduct(Product product);
	public List<Product> getproductByCategory(String categoryId);


}
