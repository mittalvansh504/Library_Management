package com.management.Library_Management.service;

import com.management.Library_Management.entities.Cart;
import com.management.Library_Management.repository.CartRepository;
import com.management.Library_Management.requests.RequestForCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartImpl implements CartInterface{

    @Autowired
    private CartRepository cartRepository;

    @Override
    public void addcartvalue(RequestForCart requestForCart) {
        Cart cart = new Cart();
        cart.setBook_name(requestForCart.getBook_name());
        cart.setPublished_by(requestForCart.getPublished_by());
        cart.setPrice(requestForCart.getPrice());
        cartRepository.save(cart);
    }
}
