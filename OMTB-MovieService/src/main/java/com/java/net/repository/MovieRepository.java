package com.java.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.net.entity.Movie;

@EnableJpaRepositories
public interface MovieRepository extends JpaRepository<Movie, String> {

	Movie findByMovieId(String movieId);

}
