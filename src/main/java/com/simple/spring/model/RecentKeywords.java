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
public class RecentKeywords {
	
	@Id
	@GeneratedValue
	public Long id;
	public String keywords;
	public String createDateTime;
	
	public void setKeywords(String keywords) {
		// TODO Auto-generated method stub
		this.keywords = keywords;
	}
	public void setCreateDateTime(String createDateTime) {
		// TODO Auto-generated method stub
		this.createDateTime = createDateTime;		
	}
}
