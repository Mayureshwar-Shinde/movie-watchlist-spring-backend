package com.movie.watchlist.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.movie.watchlist.responsestructure.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	private ApiResponse<Object> responseBuilder(HttpStatus httpStatus, Exception exception) {
		ApiResponse<Object> response = new ApiResponse<>(
				httpStatus.value(), null, exception.getMessage());
		return response;
	}
	
	@ExceptionHandler(DoesNotExistException.class)
	public ApiResponse<Object> handleDoesNotExistException(DoesNotExistException doesNotExistException) {
		return responseBuilder(HttpStatus.NOT_FOUND, doesNotExistException);
	}
}
