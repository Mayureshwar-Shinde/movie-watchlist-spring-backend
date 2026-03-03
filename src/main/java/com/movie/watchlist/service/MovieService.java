package com.movie.watchlist.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.movie.watchlist.dto.MovieDTO;
import com.movie.watchlist.entity.Movie;
import com.movie.watchlist.exception.DoesNotExistException;
import com.movie.watchlist.repository.MovieRepository;


@Service
public class MovieService {
	private final MovieRepository movieRepository;
	private final ModelMapper modelMapper;
	
	public MovieService(MovieRepository movieRepository, ModelMapper modelMapper) {
		this.movieRepository = movieRepository;
		this.modelMapper = modelMapper;
	}
	
	public Movie createMovie(MovieDTO movieDTO) {
		Movie movie = modelMapper.map(movieDTO, Movie.class);
		return movieRepository.save(movie);
	}
	
	public Movie findMovie(Integer id) {
		return movieRepository.findById(id)
				.orElseThrow(() -> new DoesNotExistException("Movie with id: " + id + " does not exist."));
	}
	
	public List<Movie> findAllMovies() {
		return movieRepository.findAll();
	}
	
	public Movie updateMovie(MovieDTO movieDTO, Integer id) {
		Movie movie = movieRepository.findById(id)
				.orElseThrow(() -> new DoesNotExistException("Movie with id: " + id + " does not exist."));
		movie.setTitle(movieDTO.getTitle());
	    movie.setDescription(movieDTO.getDescription());
	    movie.setWatched(movieDTO.getWatched());
	    movie.setRating(movieDTO.getRating());
	    movie.setThumbnail(movieDTO.getThumbnail());
		return movieRepository.save(movie);
	}
	
	public void deleteMovie(Integer id) {
		movieRepository.findById(id)
				.orElseThrow(() -> new DoesNotExistException("Movie with id: " + id + " does not exist."));
		movieRepository.deleteById(id);
	}
}

