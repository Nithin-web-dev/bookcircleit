package com.example.book.services;

import com.example.book.model.User;
import com.example.book.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        // You might add additional business logic here, like password hashing
        return userRepository.save(user);
    }
}
