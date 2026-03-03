package com.movie.watchlist.dto;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class MovieDTO {
	private Integer id;
	private String title;
	private String description;
	private Boolean watched;
	private Float rating;
	private String thumbnail;
}
