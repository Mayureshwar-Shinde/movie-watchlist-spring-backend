package com.movie.watchlist.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class TextDTO {
	private Integer textId;
	private String text;
	private String hash;
	private LocalDateTime expireAt;
}

