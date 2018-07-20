package com.net.OnlineShoppingFrontEnd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.net.OnlineShoppingBackEnd.dao.CategoryDao;
import com.net.OnlineShoppingBackEnd.dao.ProductDao;
import com.net.OnlineShoppingBackEnd.dao.UserDao;
import com.net.OnlineShoppingBackEnd.model.BillingAddress;
import com.net.OnlineShoppingBackEnd.model.ShippingAddress;
import com.net.OnlineShoppingBackEnd.model.User;

@Controller
public class HomeController {
	
	@Autowired
	UserDao userDao;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	HttpSession httpSession;
	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/")
	public String Home( Model model)
	{
		httpSession.setAttribute("categoryList",categoryDao.getCategories());
		httpSession.setAttribute("productList", productDao.getProducts());
		return "index";
	}
	@RequestMapping("/index")
	public String index( Model model)
	{
		
		return "index";
	}
	

	@RequestMapping("/register")
	public String Register( @ModelAttribute("reg")User user,Model model)
	{
		ShippingAddress shippingAddress=new ShippingAddress();
		BillingAddress billingAddress=new BillingAddress();
		
		user.setShippingAddress(shippingAddress);
		user.setBillingAddress(billingAddress);
		
		model.addAttribute("reg",user);
		return "register";
	}
	@PostMapping(value="/register")
	public String  AddRegister(@ModelAttribute("reg")User user,Model model)
	{
		
		userDao.addUSer(user);
		return "sucess";
	}
	@RequestMapping(value="/productdetails/{categoryId}",method=RequestMethod.GET)
	public String Productdetail(@PathVariable("categoryId") String categoryId,Model model)
	{
		model.addAttribute("productList",productDao.getproductByCategory(categoryId));
		model.addAttribute("productList",productDao.getProducts());
		
	
		return "productdetails";
	}
	
	

	@RequestMapping("/login")
	public String login( Model model)
	{
		return "login";
	}

	

	@RequestMapping("/adminhome")
	public String admin( Model model)
	{
		
		
		return "adminhome";
	}

	@RequestMapping("/logout")
	public String logout( Model model)
	{
		
		
		return "logout";
	}
	
	
}
