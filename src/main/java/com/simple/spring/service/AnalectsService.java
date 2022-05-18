package com.simple.spring.service;

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

    public Optional<Analects> read(String analDate) {
        return analRepository.findById(analDate);
    }

    public Analects update(String analDate, String analText) {
    	Analects anal = read(analDate).get();
    	//anal.setAnalText(analText);
        return analRepository.save(anal);
    }

    public void delete(String analDate) {
    	analRepository.deleteById(analDate);
    }
}
