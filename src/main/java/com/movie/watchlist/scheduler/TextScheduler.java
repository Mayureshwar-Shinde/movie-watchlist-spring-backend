package com.movie.watchlist.scheduler;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.movie.watchlist.repository.TextRepository;


@Component
public class TextScheduler {
	private final TextRepository textRepository;
	
	public TextScheduler(TextRepository textRepository) {
		this.textRepository = textRepository;
	}
	
	@Scheduled(cron = "0 0 * * * *")
    public void deleteExpiredTexts() {
        textRepository.deleteByExpireAtBefore(LocalDateTime.now());
    }
}

