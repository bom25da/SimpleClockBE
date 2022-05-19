package com.simple.spring.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simple.spring.model.Analects;

@Repository
public interface AnalectsRepository extends CrudRepository<Analects, String> {
		
	@Override // Create, Update
	Analects save(Analects anal);

    @Override // Read
    Optional<Analects> findById(String analectsDate);

    @Override // Delete
    void deleteById(String analectsDate);
}
