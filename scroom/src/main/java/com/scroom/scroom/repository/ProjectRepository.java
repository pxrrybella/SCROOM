package com.scroom.scroom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.scroom.scroom.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
    @Query(value= "(SELECT Project.project_name FROM Project WHERE Project.admin_name = ?1) UNION (SELECT Project.project_name FROM Project JOIN Userweb_Project ON Project.project_id = Userweb_Project.project_id JOIN Userweb ON Userweb_Project.userweb_id = Userweb.userweb_id WHERE Userweb.user_name LIKE ?1)", nativeQuery=true)
    List<String> findProjectsByUserweb(String admin_name);
}
