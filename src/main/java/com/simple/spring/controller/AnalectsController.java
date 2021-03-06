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
    public ResponseEntity<Analects> findByAnalID(@PathVariable("id") Long id) {
    	    	
        return ResponseEntity.ok()
                .body(analService.findByAnalID(id).get());
    }

    @GetMapping("/anal/read/analDate/{analDate}")
    public String findByAnalDate(@PathVariable("analDate") String analDate) {
    	    	
        return analService.findByAnalDate(analDate);
    }
    
    @GetMapping("/anal/read")
    public ResponseEntity<List<Analects>> findAll() {

        return ResponseEntity.ok(analService.findAll());
    }
    
    @PatchMapping("/anal/update/{id}")
    public ResponseEntity<Analects> read(@RequestBody Analects anal) {    	
        return ResponseEntity.ok()
                .body(analService.update(anal.id,anal.analectsDate,anal.analectsText));
    }

    @DeleteMapping("/anal/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
    	analService.delete(id);
    }
}
