package com.friendsmaven.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "app_user") // avoid reserved word 'user'
public class User {
    // getters & setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private String username;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private String role = "USER";

    public User() {} // JPA requires no-args constructor

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
