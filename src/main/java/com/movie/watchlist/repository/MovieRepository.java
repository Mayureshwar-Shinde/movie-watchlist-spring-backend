package com.movie.watchlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.watchlist.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
