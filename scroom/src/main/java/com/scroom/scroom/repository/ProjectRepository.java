package com.scroom.scroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scroom.scroom.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
    
}
