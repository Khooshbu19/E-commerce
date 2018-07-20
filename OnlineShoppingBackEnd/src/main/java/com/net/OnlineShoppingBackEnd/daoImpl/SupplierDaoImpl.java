package com.net.OnlineShoppingBackEnd.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.OnlineShoppingBackEnd.dao.SupplierDao;
import com.net.OnlineShoppingBackEnd.model.Supplier;
@Transactional
@Repository
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addSupplier(Supplier supplier) {
		
		Session session=sessionFactory.getCurrentSession();
		supplier.setSupplierId(supplier.getSupplierName());
		
		try {
			 
				
			 session.persist(supplier);
		 return true ;
		 }
				catch(HibernateException e)
		 	{
					e.printStackTrace();
				return false;
			}

		}

			@SuppressWarnings({ "unchecked" })
			public List<Supplier> getSuppliers() {
	
				return (List<Supplier>) sessionFactory.getCurrentSession().createQuery("from Supplier").list();
				
	}

	public Supplier getSupplier(String supplierId) {
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class,supplierId);
		
	}

	public void deleteSupplier(String supplierId) {
Session session=sessionFactory.getCurrentSession();	
		
		session.delete(getSupplier(supplierId));

	}

	public void updateSupplier(Supplier supplier) {
Session session=sessionFactory.getCurrentSession();	
		
		session.update(supplier);  	
	}



	
}
