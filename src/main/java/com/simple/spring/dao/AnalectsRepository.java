package com.simple.spring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simple.spring.model.Analects;

@Repository
public interface AnalectsRepository extends CrudRepository<Analects, Integer> {
		
	@Override // Create, Update
	Analects save(Analects anal);

    @Override // Read
    Optional<Analects> findById(Integer id);
    @Override // Read All
    List<Analects> findAll();

    @Override // Delete
    void deleteById(Integer id);
}
