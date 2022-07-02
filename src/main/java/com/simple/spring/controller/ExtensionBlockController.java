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
import com.simple.spring.model.ExtensionBlock;
import com.simple.spring.model.RecentKeywords;
import com.simple.spring.service.ExtensionBlockService;
import com.simple.spring.service.RecentKeywordsService;

@RestController
@Setter
@Getter
public class ExtensionBlockController {
	
	private ExtensionBlockService extensionService;
	
	@Autowired
	public ExtensionBlockController(ExtensionBlockService extensionService) {
		// TODO Auto-generated constructor stub
		this.extensionService = extensionService;
	}	
	
	@PostMapping("/extension/create")
    public ResponseEntity<ExtensionBlock> create(@RequestBody ExtensionBlock extension) {
        return ResponseEntity.ok()
                .body(extensionService.create(extension));
    }
    
    @GetMapping("/extension/read")
    public ResponseEntity<List<ExtensionBlock>> findAll() {

        return ResponseEntity.ok(extensionService.findAll());
    }

    @DeleteMapping("/extension/delete/{id}")
    public void delete(@PathVariable("id") String id) {
    	extensionService.delete(id);
    }
}
