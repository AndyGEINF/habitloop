package com.habitloop.backend.service;

import com.habitloop.backend.model.User;
import com.habitloop.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Lógica para crear un usuario
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
