package com.simple.hellomodule.application;

import com.simple.hellomodule.common.LoggingService;
import com.simple.hellomodule.domain.User;
import com.simple.hellomodule.domain.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final LoggingService loggingService;

    public UserService(UserRepository userRepository, LoggingService loggingService) {
        this.userRepository = userRepository;
        this.loggingService = loggingService;
    }

    public User findUserById(Long userId) {
        loggingService.logInfo("find user with ID: " + userId);

        return userRepository.findById(userId).orElseThrow();
    }

    public void deleteUserById(Long userId) {
        loggingService.logInfo("delete user with ID: " + userId);

        userRepository.deleteById(userId);
    }
}
