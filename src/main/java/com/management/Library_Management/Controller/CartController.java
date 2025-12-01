package com.management.Library_Management.Controller;

import com.management.Library_Management.requests.RequestForCart;
import com.management.Library_Management.service.CartInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
