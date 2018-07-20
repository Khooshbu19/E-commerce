package com.net.OnlineShoppingBackEnd.dao;
import com.net.OnlineShoppingBackEnd.model.Cart;

public interface CartDao {
	public boolean addCart(Cart cart);

	public Cart getCartById(int cartId);
	public void updateCart(Cart cart);
	public void deleteCart(int cartId );
	public Cart getCartByUsername(String username);
	

}
