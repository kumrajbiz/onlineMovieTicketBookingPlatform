package com.java.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.net.entity.Booking;


@EnableJpaRepositories
public interface BookingRepository extends JpaRepository<Booking, String> {

	Booking getReferenceById(String book);

}
