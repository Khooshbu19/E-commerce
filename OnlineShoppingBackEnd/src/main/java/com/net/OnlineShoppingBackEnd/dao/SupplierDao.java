package com.net.OnlineShoppingBackEnd.dao;

import java.util.List;


import com.net.OnlineShoppingBackEnd.model.Supplier;


public interface SupplierDao {
	boolean addSupplier(Supplier supplier);
	public List<Supplier> getSuppliers();
	public Supplier getSupplier(String supplierId);
	public void deleteSupplier(String supplierId);
	public void updateSupplier(Supplier supplier);
	



}
