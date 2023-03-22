package com.scroom.scroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scroom.scroom.model.Proyect;
import com.scroom.scroom.service.ProyectService;

@Controller
@CrossOrigin("*")
@RestController
@RequestMapping("/proyect")
public class ProyectController {
    private ProyectService proyectService;

    public ProyectController(@Autowired ProyectService proyectService){
        this.proyectService = proyectService;
    }

    @PostMapping("/save")
    public void saveProyect(@RequestBody Proyect proyect){
        proyectService.saveProyect(proyect);
    }

    @PutMapping("/update")
    public void updateProyect(@RequestBody Proyect proyect){
        proyectService.updateProyect(proyect);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProyect(@PathVariable Integer id){
        proyectService.deleteProyect(id);
    }

    @GetMapping("/findall")
    public List<Proyect> findAll(){
        return proyectService.findAll();
    }
}
