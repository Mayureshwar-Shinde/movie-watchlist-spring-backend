package com.movie.watchlist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.watchlist.entity.Movie;
import com.movie.watchlist.repository.MovieRepository;

@Service
public class SeedingService {
	private final MovieRepository movieRepository;
	
	public SeedingService(final MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	public void seedMovie() {
		movieRepository.deleteAll();
		
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(null, "Inception", "Cobb steals information from his targets by entering their dreams. He is wanted for his alleged role in his wife's murder and his only chance at redemption is to perform a nearly impossible task.", true, 8.8f, "https://res.cloudinary.com/jerrick/image/upload/d_642250b563292b35f27461a7.png,f_jpg,fl_progressive,q_auto,w_1024/64865f6f9eec37001dad29f5.jpg"));
		movies.add(new Movie(null, "Interstellar", "A team of explorers travel through a wormhole in space in an attempt to ensure humanity’s survival.", true, 8.6f, "https://www.hauweele.net/~gawen/blog/wp-content/uploads/2014/11/interstellar.jpg"));
		movies.add(new Movie(null, "The Dark Knight", "Batman faces the Joker, a criminal mastermind who plunges Gotham City into chaos.", true, 9.0f, "https://beam-images.warnermediacdn.com/BEAM_LWM_DELIVERABLES/52217243-a137-45d6-9c6a-0dfab4633034/74906de0-d644-4b0d-bf22-e2a321583a93?host=wbd-images.prod-vod.h264.io&partner=beamcom&w=500"));
		movies.add(new Movie(null, "Avengers: Endgame", "Final battle against Thanos", true, 8.4f, "https://disney.images.edge.bamgrid.com/ripcut-delivery/v2/variant/disney/7b350a2f-0b3e-4033-8125-34c4d67e3bbe/compose?aspectRatio=1.78&format=webp&width=1200"));
		movies.add(new Movie(null, "The Matrix", "Reality is a simulation", true, 8.7f, "https://i0.wp.com/www.michigandaily.com/wp-content/uploads/2020/11/Screen-Shot-2021-05-19-at-12.59.41-PM.png?fit=2400%2C1600&ssl=1"));
		movies.add(new Movie(null, "Gladiator", "Roman general seeks revenge", false, 8.5f, "https://i.ytimg.com/vi/lKn-Agk-yAI/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLASg2MAMo33qcyBUxrTXNeesZFekg"));
		movies.add(new Movie(null, "Titanic", "Love story on a sinking ship", true, 7.8f, "https://i0.wp.com/awardswatch.com/wp-content/uploads/2023/02/Screenshot-2023-02-13-at-8.01.58-AM.png?fit=1200%2C676&ssl=1"));
		movies.add(new Movie(null, "The Shawshank Redemption", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", true, 9.3f, "https://thegoodwillblog.in/wp-content/uploads/2023/07/d56b2942bc24e60043c79b061040c63d43ba529f0db1feff055e3b7a4dcc28ce._ur19201080_.jpg?w=1568"));
		movies.add(new Movie(null, "Jurassic Park", "Dinosaurs brought back to life", false, 8.1f, "https://static0.colliderimages.com/wordpress/wp-content/uploads/2021/10/jurassic-park-movies-in-order.jpg"));
		movies.add(new Movie(null, "Avatar", "Humans explore Pandora", true, 7.8f, "https://theclimatenews.co.uk/wp-content/uploads/2023/12/Avatar-image.jpg"));
		movies.add(new Movie(null, "Hell's Paradise", "Gabimaru is a ruthless assassin from the village of Iwagakure; he is sentenced to death row; to earn his freedom, he goes to a hidden island to find the Elixar of Life.", false, 8.1f, "https://www.siliconera.com/wp-content/uploads/2023/09/free-october-2023-crunchyroll-anime-series-include-hells-paradise-zombie-land-saga.jpeg?fit=1200%2C675"));
		movies.add(new Movie(null, "Adolescence", "A family's world turns upside down when 13-year-old Jamie Miller is arrested for murdering a schoolmate: the charges against their son force them to confront every parent's worst nightmare.", false, 8.1f, "https://positionpapers.ie/wp-content/uploads/2025/04/adolescence.webp"));
		movies.add(new Movie(null, "Yes Man", "Carl, a lonely man with low self-esteem, meets a friend who convinces him to participate in a self-help programme, which challenges him to say yes to everything in life for an entire year.", false, 6.8f, "https://m.media-amazon.com/images/S/pv-target-images/fa9204f8f2d189b11a5a0f79c2ddde12fae77ee162e4676aaabb4f6f6144adba.jpg"));
		movies.add(new Movie(null, "Dog Pound", "Sentenced to a correctional facility, three juvenile delinquents realise that the facility is home to gang violence and harassment. The only way to survive it is to fight back.", true, 7.0f, "https://m.media-amazon.com/images/M/MV5BZmFjMmFhYTMtZDlmNi00YzI1LWFhZTQtNWFiYmMxM2U0NDQ4XkEyXkFqcGc@._V1_.jpg"));
		movies.add(new Movie(null, "Hello World (2019)", "A man travels in time from the year 2027 to relive his school years and to correct a bad decision.", false, 7.1f, "https://is1-ssl.mzstatic.com/image/thumb/Video124/v4/40/25/59/402559c3-41b1-5a93-16d5-1b30b560ecd9/KOCH_Hello_World_it_3840x2160_CoverArt_IT_1051596.png/1200x675.jpg"));
		movies.add(new Movie(null, "Vinland Saga", "When the powerful Viking Floki invades his village and sends orders to kill his father, Thorfinn decides to avenge his death while fulfilling his life-long desire of discovering the land of Vinland.", false, 8.8f, "https://www.whats-on-netflix.com/wp-content/uploads/2022/06/vinland-saga-season-1-netflix-release-date.png"));
		movies.add(new Movie(null, "Parasite", "A poor family schemes to become employed by a wealthy household with unexpected consequences.", true, 8.5f, "https://i.ytimg.com/vi/isOGD_7hNIY/maxresdefault.jpg"));
		movies.add(new Movie(null, "The Godfather", "Don Vito Corleone, head of a mafia family, decides to hand over his empire to his youngest son, Michael. However, his decision unintentionally puts the lives of his loved ones in grave danger.", true, 9.2f, "https://img.airtel.tv/unsafe/fit-in/1600x0/filters:format(webp)/https://xstreamcp-assets-msp.streamready.in/assets/HOTSTAR_DTH/MOVIE/690de402bd29c33a8a099890/images/LANDSCAPE_169/1746179992600-h?o=production"));
		
		movieRepository.saveAll(movies);
	}
}
