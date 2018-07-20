package com.net.OnlineShoppingBackEnd.daoImpl;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.OnlineShoppingBackEnd.dao.UserDao;
import com.net.OnlineShoppingBackEnd.model.Role;
import com.net.OnlineShoppingBackEnd.model.User;
@Transactional
@Repository("userDao")
public class UserDaoImpl implements UserDao {
@Autowired
SessionFactory sessionFactory; 
@Autowired
Role role;
	public boolean addUSer(User user) {
		Session session=sessionFactory.getCurrentSession();
		
		user.getShippingAddress().setUser(user);
	user.getBillingAddress().setUser(user);
	
		session.persist(user);
		session.persist(user.getShippingAddress());
		session.persist(user.getBillingAddress());
		role.setRolename(user.getEmail());
		session.persist(role);
		return false;
	}


}
