package com.simple.hellomodule.infrastructure.persistence;

import com.simple.hellomodule.domain.User;
import com.simple.hellomodule.domain.UserRepository;

public class UserRepositoryAdapter implements UserRepository {

    private final JpaUserRepository jpaUserRepository;

    public UserRepositoryAdapter(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public User findById(Long userId) {
        return jpaUserRepository.findById(userId).orElseThrow();
    }

    @Override
    public void deleteById(Long userId) {
        jpaUserRepository.deleteById(userId);
    }
}
