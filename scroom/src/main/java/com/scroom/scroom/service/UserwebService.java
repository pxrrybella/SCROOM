package com.scroom.scroom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.scroom.scroom.model.Userweb;
import com.scroom.scroom.repository.UserwebRepository;

@Service
@Transactional
public class UserwebService {
    private UserwebRepository userwebRepository;
    public UserwebService(UserwebRepository userwebRepository){
        this.userwebRepository = userwebRepository;
    }
    public void saveUserweb (Userweb userweb){
        this.userwebRepository.save(userweb);
    }

    public void updateUserweb (Userweb userweb){
        this.userwebRepository.save(userweb);
    }

    public void deleteUserweb(Integer id){
        userwebRepository.deleteById(id);
    }

    public List<Userweb> findAll(){
        return userwebRepository.findAll();
    }
    public Userweb findUserwebByUsername(String user_name){
        return userwebRepository.findUserwebByUsername(user_name);
    }
    







    
}
