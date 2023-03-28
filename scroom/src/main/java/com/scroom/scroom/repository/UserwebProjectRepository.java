package com.scroom.scroom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.scroom.scroom.model.UserwebProject;

public interface UserwebProjectRepository extends JpaRepository<UserwebProject, Integer>{

    @Query(value= "SELECT Project.project_name FROM Userweb JOIN UserwebProject ON Userweb.userweb_id = UserwebProject.userweb_id JOIN Project ON Project.project_id = UserwebProject.project_id WHERE Userweb.user_name = ?1", nativeQuery=true)
    List<String> findProjectsByUserweb(String user_name);
    
    //@Query(value = "SELECT * FROM estudiantes WHERE equipo_id = ?1", nativeQuery = true)
    //List <Estudiante> findEstudianteByEquipo(Integer equipo);

}
