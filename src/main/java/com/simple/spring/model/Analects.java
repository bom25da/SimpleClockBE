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
	
	public void setAnalectsDate(String analDate) {
		// TODO Auto-generated method stub
		this.analectsDate = analDate;
	}
	public void setAnalectsText(String analText) {
		// TODO Auto-generated method stub
		this.analectsText = analText;		
	}
}
