package com.scroom.scroom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.scroom.scroom.model.UserwebProyect;
import com.scroom.scroom.repository.UserwebProyectRepository;

@Service
@Transactional
public class UserwebProyectService {

    private UserwebProyectRepository userwebProyectRepository;
    public UserwebProyectService(UserwebProyectRepository userwebProyectRepository){
        this.userwebProyectRepository = userwebProyectRepository;
    }
    public void saveUserwebProyect (UserwebProyect userwebProyect){
        this.userwebProyectRepository.save(userwebProyect);
    }

    public void updateUserwebProyect (UserwebProyect userwebProyect){
        this.userwebProyectRepository.save(userwebProyect);
    }

    public void deleteUserwebProyect(Integer id){
        userwebProyectRepository.deleteById(id);
    }

    public List<UserwebProyect> findAll(){
        return userwebProyectRepository.findAll();
    }
   
    
}
