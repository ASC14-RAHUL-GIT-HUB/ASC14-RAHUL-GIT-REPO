package com.friendsmaven.service;

import com.friendsmaven.entity.User;
import com.friendsmaven.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;
    private final BCryptPasswordEncoder encoder;

    public UserService(UserRepository repo, BCryptPasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    public User register(String username, String rawPassword) {
        if (repo.existsByUsername(username)) throw new RuntimeException("User exists");
        String hashed = encoder.encode(rawPassword);
        User u = new User(username, hashed);
        return repo.save(u);
    }
}
