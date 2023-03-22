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

import com.scroom.scroom.model.Sprint;
import com.scroom.scroom.service.SprintService;

@Controller
@CrossOrigin("*")
@RestController
@RequestMapping("/sprint")
public class SprintController {
    private SprintService sprintService;

    public SprintController(@Autowired SprintService sprintService){
        this.sprintService = sprintService;
    }

    @PostMapping("/save")
    public void saveSprint(@RequestBody Sprint sprint){
        sprintService.saveSprint(sprint);
    }

    @PutMapping("/update")
    public void updateSprint(@RequestBody Sprint sprint){
        sprintService.updateSprint(sprint);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSprint(@PathVariable Integer id){
        sprintService.deleteSprint(id);
    }

    @GetMapping("/findAll")
    public List<Sprint> findAll(){
        return sprintService.findAll();
    }

}
