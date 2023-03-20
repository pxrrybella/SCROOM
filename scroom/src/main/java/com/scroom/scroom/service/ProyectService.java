package com.scroom.scroom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.scroom.scroom.model.Proyect;

import com.scroom.scroom.repository.ProyectRepository;


@Service
@Transactional
public class ProyectService {

    private ProyectRepository ProyectRepository;
    public ProyectService(ProyectRepository ProyectRepository){
        this.ProyectRepository = ProyectRepository;
    }
    public void saveProyect (Proyect proyect){
        this.ProyectRepository.save(proyect);
    }

    public void updateProyect (Proyect proyect){
        this.ProyectRepository.save(proyect);
    }

    public void deleteProyect(Integer id){
        ProyectRepository.deleteById(id);
    }

    public List<Proyect> findAll(){
        return ProyectRepository.findAll();
    }
    

    
}
