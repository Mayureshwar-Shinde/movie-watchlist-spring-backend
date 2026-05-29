package com.movie.watchlist.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.sqids.Sqids;

import com.movie.watchlist.dto.TextDTO;
import com.movie.watchlist.entity.Text;
import com.movie.watchlist.exception.DoesNotExistException;
import com.movie.watchlist.repository.TextRepository;


@Service
public class TextService {
	private final TextRepository textRepository;
	private final ModelMapper modelMapper;
	private final Sqids sqids;
	
	public TextService(TextRepository textRepository, ModelMapper modelMapper, Sqids sqids) {
		this.textRepository = textRepository;
		this.modelMapper = modelMapper;
		this.sqids = sqids;
	}
	
	public List<TextDTO> findAllText() {
		List<Text> textList = textRepository.findAll();
		return textList.stream()
				.map(text -> modelMapper.map(text, TextDTO.class))
				.collect(Collectors.toList());
	}
	
	public TextDTO saveText(TextDTO textDTO) {
		Text text = modelMapper.map(textDTO, Text.class);
		text.setHash("");
		text.setExpireAt(LocalDateTime.now().plusDays(7));
		Text savedText = textRepository.save(text);
		
		String sqid = sqids.encode(List.of(savedText.getTextId().longValue()));
		savedText.setHash(sqid);
		savedText = textRepository.save(savedText);
		
		textDTO = modelMapper.map(savedText, TextDTO.class);
		return textDTO;
	}
	
	public TextDTO findText(String hash) {
		Text text = textRepository.findByHash(hash)
				.orElseThrow(() -> new DoesNotExistException("Text with hash: " + hash + " does not exist."));
		TextDTO textDTO = modelMapper.map(text, TextDTO.class);
		return textDTO;
	}
}
