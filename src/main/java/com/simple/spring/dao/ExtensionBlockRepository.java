package com.simple.spring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simple.spring.model.ExtensionBlock;
import com.simple.spring.model.RecentKeywords;

@Repository
public interface ExtensionBlockRepository extends CrudRepository<ExtensionBlock, String> {
		
	@Override // Create, Update
	ExtensionBlock save(ExtensionBlock extension);
    
    List<ExtensionBlock> findTop200ByOrderByCreateDateTimeDesc();

    @Override // Delete
    void deleteById(String id);
}
