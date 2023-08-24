package com.hellomodule.application;

import com.hellomodule.domain.User;
import com.hellomodule.domain.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow();
    }

    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
