package com.scroom.scroom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.scroom.scroom.model.UserwebProject;
import com.scroom.scroom.model.Project;

public interface UserwebProjectRepository extends JpaRepository<UserwebProject, Integer>{

    @Query(value= "SELECT Userweb.user_name, Userweb.last_name, Project.project_name FROM Userweb JOIN UserwebProject ON Userweb.userweb_id = UserwebProject.userweb_id JOIN Project ON Project.project_id = UserwebProject.project_id where user_name like '?1';", nativeQuery=true)
    List<Project> findProjectsByUserweb(String user_name);
    
}
