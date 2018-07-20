package com.net.OnlineShoppingBackEnd.dao;

import java.util.List;

import com.net.OnlineShoppingBackEnd.model.Category;

public interface CategoryDao {
	 boolean addCategory(Category category);
		public List<Category> getCategories();
		public Category getCategory(String categoryId);
		public void deleteCategory(String categoryId);
		public void updateCategory(Category category);
		
}



