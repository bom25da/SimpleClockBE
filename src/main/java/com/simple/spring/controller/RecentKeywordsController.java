package com.simple.spring.controller;

import lombok.Getter;
import lombok.Setter;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simple.spring.dao.RecentKeywordsRepository;
import com.simple.spring.model.RecentKeywords;
import com.simple.spring.service.RecentKeywordsService;

@RestController
@Setter
@Getter
public class RecentKeywordsController {
	
	private RecentKeywordsService keywordsService;
	
	@Autowired
	public RecentKeywordsController(RecentKeywordsService keywordsService) {
		// TODO Auto-generated constructor stub
		this.keywordsService = keywordsService;
	}	
	
	@PostMapping("/keywords/create")
    public ResponseEntity<RecentKeywords> create(@RequestBody RecentKeywords keywords) {
        return ResponseEntity.ok()
                .body(keywordsService.create(keywords));
    }
    
    @GetMapping("/keywords/read")
    public ResponseEntity<List<RecentKeywords>> findAll() {

        return ResponseEntity.ok(keywordsService.findAll());
    }

    @DeleteMapping("/keywords/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
    	keywordsService.delete(id);
    }
}
