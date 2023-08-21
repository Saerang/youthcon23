package com.simple.hellomodule.domain;

public interface UserRepository {

    User findById(Long userId);

    void deleteById(Long userId);
}
