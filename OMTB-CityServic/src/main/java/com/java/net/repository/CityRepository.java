package com.java.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.net.entity.City;

@EnableJpaRepositories
public interface CityRepository extends JpaRepository<City, String> {

	City getByCityId(String cityId);

}
