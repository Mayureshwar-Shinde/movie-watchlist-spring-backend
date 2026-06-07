package com.movie.watchlist.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.watchlist.dto.TextDTO;
import com.movie.watchlist.responsestructure.ApiResponse;
import com.movie.watchlist.service.TextService;


@RestController
@RequestMapping("/text")
public class TextController {
	private final TextService textService;
	
	public TextController(TextService textService) {
		this.textService = textService;
	}
	
	@GetMapping
	public ResponseEntity<ApiResponse<List<TextDTO>>> findAllText() {
		List<TextDTO> textDtoList = textService.findAllText();
		return ResponseEntity
				.ok(new ApiResponse<List<TextDTO>>(HttpStatus.OK.value(), textDtoList, "Texts fetched successfully."));
	}
	
	@PostMapping
	public ResponseEntity<ApiResponse<TextDTO>> saveText(@RequestBody TextDTO textDTO) {
		TextDTO savedTextDTO = textService.saveText(textDTO);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new ApiResponse<TextDTO>(HttpStatus.CREATED.value(), savedTextDTO, "Text saved successfully."));
	}
	
	@GetMapping("/{hash}")
	public ResponseEntity<ApiResponse<TextDTO>> findText(@PathVariable String hash) {
		TextDTO searchedTextDTO = textService.findText(hash);
		return ResponseEntity
				.ok(new ApiResponse<TextDTO>(HttpStatus.OK.value(), searchedTextDTO, "Text fetched successfully."));
	}
}
