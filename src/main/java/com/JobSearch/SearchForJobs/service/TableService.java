package com.JobSearch.SearchForJobs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JobSearch.SearchForJobs.entity.UrlTable;
import com.JobSearch.SearchForJobs.repository.InputRepo;

@Service
public class TableService {

	@Autowired
	private final InputRepo inputRepo;

	@Autowired
	public TableService(InputRepo inputRepo) {
		this.inputRepo = inputRepo;
	}
	
	public UrlTable saveMyEntity(UrlTable urlTable) {
        return inputRepo.save(urlTable); // Save entity to database
    }

	public List<UrlTable> findAllEntity() {
		return inputRepo.findAll();
	}
	
	public UrlTable findById(Integer urlId) {
		Optional<UrlTable> result = inputRepo.findById(urlId);
        return result.orElse(null);  // If not found, return null
	}
	
}

