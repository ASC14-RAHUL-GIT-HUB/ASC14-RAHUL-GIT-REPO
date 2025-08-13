package com.vls.primary.controller;

import com.vls.primary.entity.CartEntity;
import com.vls.primary.entity.CourseEntity;
import com.vls.primary.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

//
    @PostMapping("/add/{courseId}")
    public CourseEntity addCourseToCart(@PathVariable Long courseId) {
        return cartService.addCourseToCart(courseId).getCourse();
    }

//
    @GetMapping
    public List<CartEntity> getCartItems() {
        return cartService.getAllCartItems();
    }

    @DeleteMapping("/remove/{cartId}")
    public void removeCartItem(@PathVariable Long cartId) {
        cartService.removeCartItem(cartId);
    }

    @DeleteMapping("/clear")
    public void clearCart() {
        cartService.clearCart();
    }
}
