package com.spicinemas.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection="Battery")
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@Getter
@Setter
public class Battery {
	private String uid;
	private String uname;
}
