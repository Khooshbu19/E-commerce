package com.net.OnlineShoppingFrontEnd.controller;

import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.net.OnlineShoppingBackEnd.dao.CategoryDao;
import com.net.OnlineShoppingBackEnd.dao.ProductDao;
import com.net.OnlineShoppingBackEnd.dao.SupplierDao;
import com.net.OnlineShoppingBackEnd.model.Product;
@Controller
public class ProductController {

	@Autowired 
	Product product;
	@Autowired
	ProductDao productDao;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	SupplierDao supplierDao;
	@Autowired
	HttpSession httpSession;
	@RequestMapping("/product")
	public String Product(@ModelAttribute("p") Product product,Model model)
	{
		model.addAttribute("p",product);
		
		model.addAttribute("productList",productDao.getProducts());
		model.addAttribute("categoryList",categoryDao.getCategories());
		model.addAttribute("supplierList",supplierDao.getSuppliers());
		return "product";
	}
	@PostMapping(value="/product")
	public String addProduct(@ModelAttribute("p")Product product,Model model)
	{
		if(product.getProductId()== 0)
		{
			productDao.addProduct(product);
			
			MultipartFile f=product.getImage();
			ServletContext servletContext=httpSession.getServletContext();
			String filelocation=servletContext.getRealPath("/resources/images/");
			System.out.println(filelocation);
			String filename=filelocation+"\\"+product.getProductId()+".jpg";
	  
	            try {
	               
	                byte[] bytes = f.getBytes();
	                FileOutputStream buffStream=new FileOutputStream(filename);
	                buffStream.write(bytes);
	                buffStream.close();
	                
	            } catch (Exception e) {
	                
	          
			}
		}
		else
		{
			productDao.updateproduct(product);
		}
		model.addAttribute("productList",productDao.getProducts());
		
		return "product";
	}
	@RequestMapping(value="/deleteproduct/{productId}", method=RequestMethod.GET)
	public String deleteProduct(@PathVariable("productId")int productId ,Model model)
	{
		System.out.println(productId);
		productDao.deleteProduct(productId);;
		System.out.println(productId);
		model.addAttribute("productList",productDao.getProducts());
		return "redirect:/product";
	}
		
	@RequestMapping(value="/updateproduct/{productId}", method=RequestMethod.GET)
	public String editProduct(@PathVariable("productId") int productId,Model model)
	{
		model.addAttribute("productList",productDao.getProducts());
		model.addAttribute("p",productDao.getProduct(productId));
		return "product";
	}
	@RequestMapping(value="/productByCategory/{categoryId}", method=RequestMethod.GET)
	public String ProductByCategory(@PathVariable("categoryId") String categoryId,Model model)
	{
		model.addAttribute("productList",productDao.getproductByCategory( categoryId));
		
		return "product";
	}
	
	@RequestMapping(value="/moredetail/{productId}",method=RequestMethod.GET)
	public String moredetailpage(@PathVariable("productId") int productId,Model model)
	{
		model.addAttribute("product",productDao.getProduct(productId));
		return "moredetail";
	}
	



}
