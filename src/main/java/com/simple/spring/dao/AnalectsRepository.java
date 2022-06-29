package com.simple.spring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simple.spring.model.Analects;

@Repository
public interface AnalectsRepository extends CrudRepository<Analects, Long> {
		
	@Override // Create, Update
	Analects save(Analects anal);

    @Override // Read
    Optional<Analects> findById(Long id);

     // Read Date
    @Query(value = "select t1.analectsText from Analects t1 where t1.analectsDate = :analDate")
    String findByAnalDate(String analDate);
    
    @Override // Read All
    List<Analects> findAll();

    @Override // Delete
    void deleteById(Long id);
}
