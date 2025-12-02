package com.management.Library_Management.Controller;

import com.management.Library_Management.entities.Cart;
import com.management.Library_Management.requests.RequestForCart;
import com.management.Library_Management.service.CartInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartInterface cartInterface;

    @PostMapping("/addcart")
    public String addcartvalue(@RequestBody RequestForCart requestForCart){
        cartInterface.addcartvalue(requestForCart);
        return "Done";
    }

    @GetMapping("/cartbybookname/{bookname}")
    public Cart getbookname(@PathVariable String bookname){
        return cartInterface.getbookname(bookname);
    }

    @GetMapping("/cartbyauthorname/{authorname}")
    public Cart getauthorname(@PathVariable String authorname){
        return cartInterface.getCartByPublishedBy(authorname);
    }

}
