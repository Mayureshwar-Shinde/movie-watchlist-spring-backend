package com.movie.watchlist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.watchlist.service.SeedingService;

@RestController
@RequestMapping("/seed")
public class SeedingController {
	private final SeedingService seedingService;
	
	public SeedingController(SeedingService seedingService) {
		this.seedingService = seedingService;
	}
	
	@GetMapping("/movie")
	public String seedMovie() {
		seedingService.seedMovie();
		return "Movies seeded successfully";
	}
}
