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

import com.scroom.scroom.model.Project;
import com.scroom.scroom.service.ProjectService;

@Controller
@CrossOrigin("*")
@RestController
@RequestMapping("/project")
public class ProjectController {
    private ProjectService projectService;

    public ProjectController(@Autowired ProjectService projectService){
        this.projectService = projectService;
    }

    @PostMapping("/save")
    public void saveProject(@RequestBody Project project){
        projectService.saveProject(project);
    }

    @PutMapping("/update")
    public void updateProject(@RequestBody Project project){
        projectService.updateProject(project);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable Integer id){
        projectService.deleteProject(id);
    }

    @GetMapping("/findAll")
    public List<Project> findAll(){
        return projectService.findAll();
    }
}
