package com.simple.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.simple.spring.dao.RecentKeywordsRepository;
import com.simple.spring.model.RecentKeywords;

@Service
public class RecentKeywordsService {
	
	private RecentKeywordsRepository keywordsRepository;
	
	@Autowired
    public RecentKeywordsService(RecentKeywordsRepository keywordsRepository) {
        this.keywordsRepository = keywordsRepository;
    }
			
	public RecentKeywords create(RecentKeywords keywords) {
        return keywordsRepository.save(keywords);
    }

    public List<RecentKeywords> findAll() {
        return keywordsRepository.findTop10ByOrderByIdDesc();
    }

    public void delete(Long id) {
    	keywordsRepository.deleteById(id);
    }
}
