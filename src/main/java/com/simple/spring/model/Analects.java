package com.simple.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Analects {
	
	@Id
	@GeneratedValue
	public Long id;
	public String analectsDate;
	public String analectsText;
}
