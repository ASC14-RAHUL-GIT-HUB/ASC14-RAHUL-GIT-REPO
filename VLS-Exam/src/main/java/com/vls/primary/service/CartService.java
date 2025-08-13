package com.vls.primary.service;

import com.vls.primary.entity.CartEntity;
import java.util.List;

public interface CartService {
    CartEntity addCourseToCart(Long courseId);
    List<CartEntity> getAllCartItems();
    void removeCartItem(Long cartId);
    void clearCart();
}
