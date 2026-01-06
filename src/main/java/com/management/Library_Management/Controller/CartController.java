package com.management.Library_Management.Controller;

import com.management.Library_Management.entities.Cart;
import com.management.Library_Management.requests.RequestForCart;
import com.management.Library_Management.service.CartInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:5173")
public class CartController {

    @Autowired
    private CartInterface cartInterface;

    @PostMapping("/add")
    public ResponseEntity<String> addCartValue(@RequestBody RequestForCart requestForCart) {
        cartInterface.addcartvalue(requestForCart);
        return ResponseEntity.ok("Cart item added successfully");
    }

    @GetMapping("/book/{bookName}")
    public ResponseEntity<List<Cart>> getCartByBookName(@PathVariable String bookName) {
        return ResponseEntity.ok(cartInterface.getbookname(bookName));
    }

    @GetMapping("/author/{authorName}")
    public ResponseEntity<List<Cart>> getCartByAuthorName(@PathVariable String authorName) {
        return ResponseEntity.ok(cartInterface.getCartByPublishedBy(authorName));
    }
}
