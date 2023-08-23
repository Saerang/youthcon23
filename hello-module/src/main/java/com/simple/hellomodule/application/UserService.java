package com.simple.hellomodule.application;

import com.simple.hellomodule.infrastructure.LogHandler;
import com.simple.hellomodule.domain.User;
import com.simple.hellomodule.domain.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final LogHandler logHandler;

    public UserService(UserRepository userRepository, LogHandler logHandler) {
        this.userRepository = userRepository;
        this.logHandler = logHandler;
    }

    public User findUserById(Long userId) {
        logHandler.logInfo("find user with ID: " + userId);

        return userRepository.findById(userId).orElseThrow();
    }

    public void deleteUserById(Long userId) {
        logHandler.logInfo("delete user with ID: " + userId);

        userRepository.deleteById(userId);
    }
}
