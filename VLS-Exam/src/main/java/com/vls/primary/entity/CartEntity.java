package com.vls.primary.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseEntity course;

    public CartEntity() {}

    public CartEntity(CourseEntity course) {
        this.course = course;
    }

    public Long getCartId() { return cartId; }
    public void setCartId(Long cartId) { this.cartId = cartId; }

    public CourseEntity getCourse() { return course; }
    public void setCourse(CourseEntity course) { this.course = course; }
}
