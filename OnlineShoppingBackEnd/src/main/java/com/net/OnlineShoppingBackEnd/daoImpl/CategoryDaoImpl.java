package com.net.OnlineShoppingBackEnd.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.OnlineShoppingBackEnd.dao.CategoryDao;
import com.net.OnlineShoppingBackEnd.model.Category;
@Transactional
@Repository
public class CategoryDaoImpl implements CategoryDao {
	@Autowired

	private SessionFactory sessionFactory;

	public boolean addCategory(Category category)
 	{
	

	Session session=sessionFactory.getCurrentSession();
	category.setCategoryId(category.getCategoryName());
	

	try{
			
		session.persist(category);

			return true;

		}
		
	catch(HibernateException e)
	{
	e.printStackTrace();

	return false;

	}
			
	
	}

	
	@SuppressWarnings({ "unchecked" })

	public List<Category> getCategories() 
	{

	
	return (List<Category>) sessionFactory.getCurrentSession().createQuery("from Category").list();

	}

	public Category getCategory(String categoryId) 
	{


		return (Category) sessionFactory.getCurrentSession().get(Category.class,categoryId);


	}

	public void deleteCategory(String categoryId)
 	{

		Session session=sessionFactory.getCurrentSession();
	
		session.delete(getCategory(categoryId));

	}
	
	public void updateCategory(Category category)
 	{

	Session session=sessionFactory.getCurrentSession();	

	session.update(category);
 
	}

}
