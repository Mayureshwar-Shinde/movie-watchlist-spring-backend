package com.movie.watchlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class MovieWatchlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieWatchlistApplication.class, args);
	}

}
