package com.net.OnlineShoppingBackEnd.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.net.OnlineShoppingBackEnd.model.BillingAddress;
import com.net.OnlineShoppingBackEnd.model.Cart;
import com.net.OnlineShoppingBackEnd.model.CartItem;
import com.net.OnlineShoppingBackEnd.model.Category;
import com.net.OnlineShoppingBackEnd.model.Product;
import com.net.OnlineShoppingBackEnd.model.Role;
import com.net.OnlineShoppingBackEnd.model.ShippingAddress;
import com.net.OnlineShoppingBackEnd.model.Supplier;
import com.net.OnlineShoppingBackEnd.model.User;


@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.net.OnlineShoppingBackEnd")
public class HibernateConfig {
	@Bean(name="dataSource")
	public DataSource geth2DataSource()
	{
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("kh");
		dataSource.setPassword("kh");
		return dataSource;		
	}
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder sessionFactory=new LocalSessionFactoryBuilder(dataSource);
	
		sessionFactory.addAnnotatedClass(User.class);
		sessionFactory.addAnnotatedClass(ShippingAddress.class);
		sessionFactory.addAnnotatedClass(BillingAddress.class);
		sessionFactory.addAnnotatedClass(Product.class);
		sessionFactory.addAnnotatedClass(Category.class);
		sessionFactory.addAnnotatedClass(Supplier.class);
		sessionFactory.addAnnotatedClass(Role.class);
		sessionFactory.addAnnotatedClass(Cart.class);
		sessionFactory.addAnnotatedClass(CartItem.class);
		
		sessionFactory.addProperties(getHibernateProperties());
		
			
		
		return sessionFactory.buildSessionFactory();
		
	}
	public Properties getHibernateProperties()
	{

		Properties properties=new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto","update");
		return properties;
	}
	@Autowired
	@Bean
	public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager=new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return transactionManager;
	}


}
