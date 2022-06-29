package com.simple.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.simple.spring.dao.ExtensionBlockRepository;
import com.simple.spring.dao.RecentKeywordsRepository;
import com.simple.spring.model.ExtensionBlock;
import com.simple.spring.model.RecentKeywords;

@Service
public class ExtensionBlockService {
	
	private ExtensionBlockRepository extensionRepository;
	
	@Autowired
    public ExtensionBlockService(ExtensionBlockRepository extensionRepository) {
        this.extensionRepository = extensionRepository;
    }
			
	public ExtensionBlock create(ExtensionBlock keywords) {
        return extensionRepository.save(keywords);
    }

    public List<ExtensionBlock> findAll() {
        return extensionRepository.findTop200ByOrderByIdDesc();
    }

    public void delete(Long id) {
    	extensionRepository.deleteById(id);
    }
}
