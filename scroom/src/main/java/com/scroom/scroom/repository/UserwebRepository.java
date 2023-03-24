package com.scroom.scroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scroom.scroom.model.Userweb;

public interface UserwebRepository extends JpaRepository<Userweb, Integer>{
    /* @Query(value= "SELECT Userweb.userName, Userweb.lastName, Project.projectName FROM Userweb JOIN UserwebProject ON Userweb.userweb_id = UserwebProject.userweb_id JOIN Project ON Project.project_id = UserwebProject.project_id", nativeQuery=true)
    List<Userweb> findProjectByUserweb(); */
}
