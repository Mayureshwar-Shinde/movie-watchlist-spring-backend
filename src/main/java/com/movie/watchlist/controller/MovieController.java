package com.movie.watchlist.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.watchlist.dto.MovieDTO;
import com.movie.watchlist.entity.Movie;
import com.movie.watchlist.responsestructure.ApiResponse;
import com.movie.watchlist.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	private final MovieService movieService;
	
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@GetMapping
	public ApiResponse<List<Movie>> getAllMovies() {
		List<Movie> movies = movieService.findAllMovies();
		return new ApiResponse<List<Movie>>(HttpStatus.OK.value(), movies, "Movies fetched successfully.");
	}
	
	@GetMapping("/{id}")
	public ApiResponse<Movie> getMovie(@PathVariable int id) {
		Movie movie = movieService.findMovie(id);
		return new ApiResponse<Movie>(HttpStatus.OK.value(), movie, "Movie fetched successfully.");
	}
	
	@PostMapping
	public ApiResponse<Movie> createMovie(@RequestBody MovieDTO movieDTO) {
		Movie movie = movieService.createMovie(movieDTO);
		return new ApiResponse<Movie>(HttpStatus.CREATED.value(), movie, "Movie created successfully.");
	}
	
	@PutMapping("/{id}")
	public ApiResponse<Movie> updateMovie(@RequestBody MovieDTO movieDTO, @PathVariable int id) {
		Movie movie = movieService.updateMovie(movieDTO, id);
		return new ApiResponse<>(HttpStatus.OK.value(), movie, "Movie updated successfully.");
	}
	
	@DeleteMapping("/{id}")
	public ApiResponse<Void> deleteMovie(@PathVariable int id) {
		movieService.deleteMovie(id);
		return new ApiResponse<Void>(HttpStatus.NO_CONTENT.value(), null, "Movie deleted successfully.");
	}
}



