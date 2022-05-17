package com.simple.spring.controller;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simple.spring.dao.AnalectsRepository;
import com.simple.spring.model.Analects;
import com.simple.spring.service.AnalectsService;

@RestController
@Setter
@Getter
public class AnalectsController {
	
	private AnalectsService analService;
	
	@Autowired
	public AnalectsController(AnalectsService analService) {
		// TODO Auto-generated constructor stub
		this.analService = analService;
	}
	
	
	@PostMapping("/anal/create")
    public ResponseEntity<Analects> create(@RequestBody Analects anal) {
        return ResponseEntity.ok()
                .body(analService.create(anal));
    }

    @GetMapping("/anal/read/{id}")
    public ResponseEntity<Analects> read(@PathVariable String analDate) {
        return ResponseEntity.ok()
                .body(analService.read(analDate).get());
    }
    @PutMapping("/anal/update")
    public ResponseEntity<Analects> read(@RequestParam String analDate, @RequestParam String analText) {
        return ResponseEntity.ok()
                .body(analService.update(analDate,analText));
    }

    @DeleteMapping("/anal/delete/{id}")
    public void delete(@PathVariable String analDate) {
    	analService.delete(analDate);
    }
}
