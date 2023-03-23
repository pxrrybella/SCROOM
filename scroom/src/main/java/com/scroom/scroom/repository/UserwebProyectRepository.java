package com.scroom.scroom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.scroom.scroom.model.UserwebProyect;
import com.scroom.scroom.model.Proyect;

public interface UserwebProyectRepository extends JpaRepository<UserwebProyect, Integer>{
    @Query(value= "SELECT Userweb.user_name, Userweb.last_name, Proyect.proyect_name FROM Userweb JOIN UserwebProyect ON Userweb.userweb_id = UserwebProyect.userweb_id JOIN Proyect ON Proyect.proyect_id = UserwebProyect.proyect_id where user_name like '?1';", nativeQuery=true)
    List<Proyect> findProyectsByUserweb(String user_name);
}
