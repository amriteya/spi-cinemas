package com.spicinemas.model;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection="Screen")
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@Getter
@Setter
public class Screen {	
	
	private String uid;
	private String name;
	
	ArrayList<ArrayList<Integer>> seat_layout = new ArrayList<ArrayList<Integer>>();
	
}
