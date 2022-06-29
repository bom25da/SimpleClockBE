package com.simple.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.simple.spring.dao.AnalectsRepository;
import com.simple.spring.model.Analects;

@Service
public class AnalectsService {
	
	private AnalectsRepository analRepository;
	
	@Autowired
    public AnalectsService(AnalectsRepository analRepository) {
        this.analRepository = analRepository;
    }
			
	public Analects create(Analects anal) {
        return analRepository.save(anal);
    }

    public Optional<Analects> findByAnalID(Long id) {
        return analRepository.findById(id);
    }

    public String findByAnalDate(String analDate) {
        return analRepository.findByAnalDate(analDate);
    }

    public List<Analects> findAll() {
        return analRepository.findAll();
    }

    public Analects update(Long id, String analDate, String analText) {
    	Analects anal = findByAnalID(id).get();
    	
    	anal.setAnalectsDate(analDate);
    	anal.setAnalectsText(analText);
    	
        return analRepository.save(anal);
    }

    public void delete(Long id) {
    	analRepository.deleteById(id);
    }
}
