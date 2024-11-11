package com.JobSearch.SearchForJobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JobSearch.SearchForJobs.entity.UrlTable;


public interface InputRepo extends JpaRepository<UrlTable, Integer>{

}
