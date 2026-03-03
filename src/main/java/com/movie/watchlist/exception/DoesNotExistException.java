package com.movie.watchlist.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class DoesNotExistException extends RuntimeException {
	private String message;
}
