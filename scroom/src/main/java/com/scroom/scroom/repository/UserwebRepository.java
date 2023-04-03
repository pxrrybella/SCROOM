package com.scroom.scroom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.scroom.scroom.model.Userweb;

public interface UserwebRepository extends JpaRepository<Userweb, Integer>{
    /* @Query(value= "SELECT Userweb.userName, Userweb.lastName, Project.projectName FROM Userweb JOIN UserwebProject ON Userweb.userweb_id = UserwebProject.userweb_id JOIN Project ON Project.project_id = UserwebProject.project_id", nativeQuery=true)
    List<Userweb> findProjectByUserweb(); */

    @Query(value= "SELECT Userweb.first_name from Userweb WHERE Userweb.user_name = ?1", nativeQuery=true) String findUserwebFirstName(String user_name);

    @Query(value= "SELECT Userweb.last_name from Userweb WHERE Userweb.user_name = ?1", nativeQuery=true) String findUserwebLastName(String user_name);

    @Query(value= "SELECT * from Userweb WHERE Userweb.user_name = ?1", nativeQuery=true) Userweb findUserwebFirstLastName(String user_name);
}
