package com.java.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.net.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater, String> {

	Theater findByTheaterId(String theaterId);

}
