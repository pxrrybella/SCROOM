package com.scroom.scroom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.scroom.scroom.model.UserwebProject;
import com.scroom.scroom.repository.UserwebProjectRepository;
import com.scroom.scroom.model.Userweb;

@Service
@Transactional
public class UserwebProjectService {

    private UserwebProjectRepository userwebProjectRepository;
    public UserwebProjectService(UserwebProjectRepository userwebProjectRepository){
        this.userwebProjectRepository = userwebProjectRepository;
    }
    public void saveUserwebProject (UserwebProject userwebProject){
        this.userwebProjectRepository.save(userwebProject);
    }

    public void updateUserwebProject (UserwebProject userwebProject){
        this.userwebProjectRepository.save(userwebProject);
    }

    public void deleteUserwebProject(Integer id){
        userwebProjectRepository.deleteById(id);
    }

    public List<UserwebProject> findAll(){
        return userwebProjectRepository.findAll();
    }

    public List<String> projectsByUserweb(String user_name){
        return userwebProjectRepository.findProjectsByUserweb(user_name);
    }

    public List<Integer> userwebByProjects(Integer project_id){
        return userwebProjectRepository.findUserwebByProjects(project_id);
    }
}
