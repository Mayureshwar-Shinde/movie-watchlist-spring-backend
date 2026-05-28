package com.movie.watchlist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "texts")
public class Text {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer textId;
	
	@Column(nullable = false)
	private String text;
	
	@Column(nullable = false)
	private Integer hash;
}
