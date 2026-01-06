package com.management.Library_Management.service;

import com.management.Library_Management.entities.Cart;
import com.management.Library_Management.repository.CartRepository;
import com.management.Library_Management.requests.RequestForCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartImpl implements CartInterface {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public void addcartvalue(RequestForCart requestForCart) {
        Cart cart = new Cart();
        cart.setBookName(requestForCart.getBook_name());
        cart.setPublishedBy(requestForCart.getPublished_by());
        cart.setPrice(requestForCart.getPrice());
        cartRepository.save(cart);
    }

    @Override
    public List<Cart> getbookname(String bookName) {
        return cartRepository.findByBookName(bookName);
    }

    @Override
    public List<Cart> getCartByPublishedBy(String publishedBy) {
        return cartRepository.findByPublishedBy(publishedBy);
    }
}
