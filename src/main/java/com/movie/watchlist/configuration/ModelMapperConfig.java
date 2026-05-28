package com.movie.watchlist.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sqids.Sqids;

@Configuration
public class ModelMapperConfig {
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Bean
    Sqids sqids() {
        return Sqids.builder()
                .minLength(6)
                .alphabet("0123456789")
                .build();
    }
}
