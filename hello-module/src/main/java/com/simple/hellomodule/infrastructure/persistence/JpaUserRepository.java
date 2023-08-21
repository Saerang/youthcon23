package com.simple.hellomodule.infrastructure.persistence;

import com.simple.hellomodule.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {
}
