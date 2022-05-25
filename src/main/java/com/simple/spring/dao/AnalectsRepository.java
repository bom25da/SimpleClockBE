package com.simple.spring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simple.spring.model.Analects;

@Repository
public interface AnalectsRepository extends CrudRepository<Analects, Long> {
		
	@Override // Create, Update
	Analects save(Analects anal);

    @Override // Read
    Optional<Analects> findById(Long id);
    @Override // Read All
    List<Analects> findAll();

    @Override // Delete
    void deleteById(Long id);
}
