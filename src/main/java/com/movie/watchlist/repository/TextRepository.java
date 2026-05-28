package com.movie.watchlist.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.watchlist.entity.Text;

public interface TextRepository extends JpaRepository<Text, Integer> {
	public Optional<Text> findByHash(Integer id);
}
