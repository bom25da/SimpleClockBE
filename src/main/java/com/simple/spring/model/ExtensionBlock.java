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
public class ExtensionBlock {
	
	@Id
	@GeneratedValue
	public Long id;
	public String extension;
	public String createDateTime;
	
	public void setExtension(String extension) {
		// TODO Auto-generated method stub
		this.extension = extension;
	}
	public void setCreateDateTime(String createDateTime) {
		// TODO Auto-generated method stub
		this.createDateTime = createDateTime;		
	}
}
