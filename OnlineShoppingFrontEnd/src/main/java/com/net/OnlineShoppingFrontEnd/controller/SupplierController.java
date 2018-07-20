package com.net.OnlineShoppingFrontEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.net.OnlineShoppingBackEnd.dao.SupplierDao;
import com.net.OnlineShoppingBackEnd.model.Supplier;

@Controller
public class SupplierController {
	

		
		@Autowired
		Supplier supplier;
		@Autowired
		SupplierDao supplierDao;
		
		
		@RequestMapping("/supplier")
		public String supplier(@ModelAttribute("sup") Supplier supplier,Model model)
		{
			model.addAttribute("sup",supplier);
			List<Supplier>supplierList=supplierDao.getSuppliers();
			model.addAttribute("supplierList",supplierList);
			System.out.println("acb");
			return "supplier";
		}
		@PostMapping("/supplier")
		public String addsupplier(@ModelAttribute("sup") Supplier supplier,Model model)
		{
				if(supplier.getSupplierId() == null)
			{
					
					supplierDao.addSupplier(supplier);
					
			}
			else
			{
				
				
				supplierDao.updateSupplier(supplier);
				
			}
		
		model.addAttribute("supplierList",supplierDao.getSuppliers());
		
			return "supplier";
		}
		@RequestMapping(value = "/deletesupplier/{supplierId}", method = RequestMethod.GET)
		public String deletesupplier(@PathVariable("supplierId") String supplierId,Model model)
		{
			supplierDao.deleteSupplier(supplierId);
			
			model.addAttribute("supplierList",supplierDao.getSuppliers());
			
			
			return "redirect:/supplier";
		
		}
		
		@RequestMapping(value = "/editsupplier/{supplierId}", method = RequestMethod.GET)
		public String editsupplier(@PathVariable("supplierId") String supplierId,Model model)
		{
			
				model.addAttribute("sup",supplierDao.getSupplier(supplierId));
					
				model.addAttribute("supplierList",supplierDao.getSuppliers());
				return "supplier";
		}
	}
		
		
		
		
		



