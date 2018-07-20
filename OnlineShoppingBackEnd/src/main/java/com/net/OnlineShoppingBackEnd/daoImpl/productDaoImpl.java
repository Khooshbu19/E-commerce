package com.net.OnlineShoppingBackEnd.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.OnlineShoppingBackEnd.dao.ProductDao;
import com.net.OnlineShoppingBackEnd.model.Product;
@Transactional
@Repository
public class productDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		
		Session session=sessionFactory.getCurrentSession();
		
		 try {
			 
				
			 session.persist(product);
		 return true ;
		 }
				catch(HibernateException e)
		 	{
					e.printStackTrace();
				return false;
			}
	}

	@SuppressWarnings({ "unchecked" })
	public List<Product> getProducts() {
	
		return (List<Product>) sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	public Product getProduct(int productId) {
		

		return (Product) sessionFactory.getCurrentSession().get(Product.class,productId);
	}

	

	public void deleteProduct(int productId) 
	{
		Session session=sessionFactory.getCurrentSession();	
		session.delete(getProduct(productId));

	}

	public void updateproduct(Product product) {
Session session=sessionFactory.getCurrentSession();	
		
		session.update(product);  

	}
	@SuppressWarnings({ "unchecked" })
	public List<Product> getproductByCategory(String categoryId) {
		
		return (List<Product>) sessionFactory.getCurrentSession().createQuery("from Product").list();

	}

}
