package com.management.Library_Management.service;

import com.management.Library_Management.entities.Cart;
import com.management.Library_Management.requests.RequestForCart;

import java.util.List;

public interface CartInterface {
    void addcartvalue(RequestForCart requestForCart);

    Cart getbookname(String bookname);

    Cart getCartByPublishedBy(String authorname);
}
