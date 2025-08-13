package com.vls.primary.service;

import com.vls.primary.entity.CartEntity;
import com.vls.primary.entity.CourseEntity;
import com.vls.primary.repository.CartRepository;
import com.vls.primary.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

//    @Autowired
    private CartRepository cartRepository;
    private CourseRepository courseRepository;

    public CartServiceImpl(CartRepository cartRepository, CourseRepository courseRepository) {
        this.cartRepository = cartRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public CartEntity addCourseToCart(Long courseId) {
        CourseEntity course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found.. for Id: " + courseId));
        CartEntity cartItem = new CartEntity(course);
        return cartRepository.save(cartItem);
    }

    @Override
    public List<CartEntity> getAllCartItems() {
        return cartRepository.findAll();
    }

    @Override
    public void removeCartItem(Long cartId) {
        cartRepository.deleteById(cartId);
    }

    @Override
    public void clearCart() {
        cartRepository.deleteAll();
    }
}
