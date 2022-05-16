package com.simple.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Analects {
	@Id
	private String AnalectsDate;
	private String AnalectsText;
}
