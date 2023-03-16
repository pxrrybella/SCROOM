package com.scroom.scroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scroom.scroom.model.Sprint;

public interface SprintRepository extends JpaRepository<Sprint, Integer>{
    
}
