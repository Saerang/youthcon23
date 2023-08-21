package com.simple.hellomodule.infrastructure.config;

import com.simple.hellomodule.domain.UserRepository;
import com.simple.hellomodule.infrastructure.persistence.JpaUserRepository;
import com.simple.hellomodule.infrastructure.persistence.UserRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserRepository userRepository(JpaUserRepository jpaUserRepository) {
        return new UserRepositoryAdapter(jpaUserRepository);
    }
}
