package com.simple.spring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simple.spring.model.RecentKeywords;

@Repository
public interface RecentKeywordsRepository extends CrudRepository<RecentKeywords, Long> {
		
	@Override // Create, Update
	RecentKeywords save(RecentKeywords keywords);
    
    List<RecentKeywords> findTop10ByOrderByIdDesc();

    @Override // Delete
    void deleteById(Long id);
}
