package com.java.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.net.entity.Screen;

@EnableJpaRepositories
public interface ScreenRepository extends JpaRepository<Screen, String> {


	Screen findByScreenId(String screenId);

}
