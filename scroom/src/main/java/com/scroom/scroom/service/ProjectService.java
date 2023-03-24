package com.scroom.scroom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.scroom.scroom.model.Project;

import com.scroom.scroom.repository.ProjectRepository;


@Service
@Transactional
public class ProjectService {

    private ProjectRepository ProjectRepository;
    public ProjectService(ProjectRepository ProjectRepository){
        this.ProjectRepository = ProjectRepository;
    }
    public void saveProject (Project project){
        this.ProjectRepository.save(project);
    }

    public void updateProject (Project project){
        this.ProjectRepository.save(project);
    }

    public void deleteProject(Integer id){
        ProjectRepository.deleteById(id);
    }

    public List<Project> findAll(){
        return ProjectRepository.findAll();
    }
    

    
}
