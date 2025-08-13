package com.vls.login.service;

import com.vls.login.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean validateUser(String username, String password) {
        return userRepository.existsByUsernameAndPassword(username, password);
    }
}
