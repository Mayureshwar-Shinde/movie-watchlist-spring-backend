package com.movie.watchlist.responsestructure;


import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ApiResponse<T> {
	private Integer code;
	private T data;
	private String message;
	private Integer count;
	
	public ApiResponse(Integer code, T data, String message) {
		this.code = code;
		this.data = data;
		this.message = message;
		this.count = calculateCount(data);
	}
	
	private Integer calculateCount(T data) {	
		if(data == null) return 0;
		if(data instanceof List<?> list) {
			return list.size();
		}
		return 1;
	}
}
