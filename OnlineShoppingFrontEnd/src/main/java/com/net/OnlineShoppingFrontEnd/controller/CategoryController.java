package com.net.OnlineShoppingFrontEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.net.OnlineShoppingBackEnd.dao.CategoryDao;
import com.net.OnlineShoppingBackEnd.model.Category;

@Controller
public class CategoryController {

	@Autowired
Category category;
	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping("/category")
	public String category(Model model)
	{
		model.addAttribute("cat",category);
		model.addAttribute("categoryList",categoryDao.getCategories());
		return "category";
	}
	@PostMapping("/category")
	public String addCategory(@ModelAttribute("cat")Category category,Model model)
	{
		if(category.getCategoryId()== null)
		{
			categoryDao.addCategory(category);
		}
		else
		{
			categoryDao.updateCategory(category);
		}
		model.addAttribute("categoryList",categoryDao.getCategories());
		return "category";
	}
	@RequestMapping(value="/deletecategory/{categoryId}", method=RequestMethod.GET)
	public String deleteCategory(@PathVariable("categoryId")String categoryId ,Model model)
	{
		categoryDao.deleteCategory(categoryId);
		model.addAttribute("categoryList",categoryDao.getCategories());
		return "redirect:/category";
	}
		
	@RequestMapping(value="/editcategory/{categoryId}", method=RequestMethod.GET)
	public String editCategory(@PathVariable("categoryId") String categoryId,Model model)
	{
		model.addAttribute("categoryList",categoryDao.getCategories());
		model.addAttribute("cat",categoryDao.getCategory(categoryId));
		return "category";
	}



}
