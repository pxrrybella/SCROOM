package com.scroom.scroom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.scroom.scroom.model.Sprint;

import com.scroom.scroom.repository.SprintRepository;


@Service
@Transactional
public class SprintService {
    private SprintRepository SprintRepository;
    public SprintService(SprintRepository SprintRepository){
        this.SprintRepository = SprintRepository;
    }
    public void saveSprint (Sprint sprint){
        this.SprintRepository.save(sprint);
    }

    public void updateSprint(Sprint sprint){
        this.SprintRepository.save(sprint);
    }

    public void deleteSprint(Integer id){
        SprintRepository.deleteById(id);
    }

    public List<Sprint> findAll(){
        return SprintRepository.findAll();
    }
 
    
 
    

    
}
