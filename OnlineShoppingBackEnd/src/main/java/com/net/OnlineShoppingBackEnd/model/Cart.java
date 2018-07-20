package com.net.OnlineShoppingBackEnd.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Cart {
	@Id
	@SequenceGenerator(name="cart_seq",sequenceName="cart_seq")
	private int cartId;

	private double totalPrice;
	@OneToOne
	User user;
	@OneToMany(mappedBy="cart",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<CartItem>cartItem;

	
	
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<CartItem> getCartItem() {
		return cartItem;
	}

	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	

}
