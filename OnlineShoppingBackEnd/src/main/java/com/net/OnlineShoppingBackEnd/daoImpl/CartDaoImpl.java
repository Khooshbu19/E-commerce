package com.net.OnlineShoppingBackEnd.daoImpl;



import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.OnlineShoppingBackEnd.dao.CartDao;
import com.net.OnlineShoppingBackEnd.model.Cart;

@Transactional
@Repository
public class CartDaoImpl implements CartDao {
@Autowired
SessionFactory sessionFactory;

	public boolean addCart(Cart cart) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(cart);
		return false;
	}
	
	
	public Cart getCartById(int cartId) {
	
		return (Cart) sessionFactory.getCurrentSession().get(Cart.class,cartId);
	}

	public void updateCart(Cart cart) {
	Session session=sessionFactory.getCurrentSession();
	session.update(cart);
		
	}

	public void deleteCart(int cartId) {
	Session session=sessionFactory.getCurrentSession();
	session.delete(cartId);
		
	}
	
	
	public Cart getCartByUsername(String username) {
		// TODO Auto-generated method stub
		return  (Cart) sessionFactory.getCurrentSession().createQuery("from  Cart");
	}

	

}
