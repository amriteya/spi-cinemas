package com.spicinemas.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection="userinfo")
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@Getter
@Setter
public class ShowTime {
	private String MovieId;
	
	private String ScreenId;
	
	private String TheatreId;
	
	private String slots;
	
	private String date;
	
}