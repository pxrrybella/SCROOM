package com.scroom.scroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scroom.scroom.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Integer>{
    
}
