package com.simple.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ExtensionBlock {
	
	@Id
	//@GeneratedValue(generator = "id")
	//@GenericGenerator(name = "id", strategy="")
	public String id;
	public String createDateTime;
	
	public void setExtension(String extension) {
		// TODO Auto-generated method stub
		this.id = extension;
	}
	public void setCreateDateTime(String createDateTime) {
		// TODO Auto-generated method stub
		this.createDateTime = createDateTime;		
	}
}
