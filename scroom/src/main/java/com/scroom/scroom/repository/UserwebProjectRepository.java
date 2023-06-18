package com.scroom.scroom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.scroom.scroom.model.UserwebProject;
import com.scroom.scroom.model.Project;
import com.scroom.scroom.model.Userweb;

public interface UserwebProjectRepository extends JpaRepository<UserwebProject, Integer>{

    
    @Query(value= "select Userweb.userweb_id, Userweb.user_name, Userweb.first_name, Userweb.last_name, Userweb.email, Userweb.user_password, Userweb.company_position, Userweb.company_id from Userweb join Userweb_Project on Userweb.userweb_id = Userweb_Project.userweb_id where Userweb_Project.project_id = ?1", nativeQuery=true)
    List<Integer> findUserwebByProjects(Integer project_id);

    //@Query(value = "SELECT * FROM estudiantes WHERE equipo_id = ?1", nativeQuery = true)
    //List <Estudiante> findEstudianteByEquipo(Integer equipo);

}
