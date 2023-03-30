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

import com.scroom.scroom.model.UserwebProject;
import com.scroom.scroom.service.UserwebProjectService;

@Controller
@CrossOrigin("*")
@RestController
@RequestMapping("/userwebproject")
public class UserwebProjectController {
    private UserwebProjectService userwebProjectService;

    public UserwebProjectController (@Autowired UserwebProjectService userwebProjectService){
        this.userwebProjectService = userwebProjectService;
    }

    @PostMapping("/save")
    public void saveUserwebProject(@RequestBody UserwebProject userwebProject){
        userwebProjectService.saveUserwebProject(userwebProject);
    }

    @PutMapping("/update")
    public void updateUserwebProject(@RequestBody UserwebProject userwebProject){
        userwebProjectService.updateUserwebProject(userwebProject);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserwebProject(@PathVariable Integer id){
        userwebProjectService.deleteUserwebProject(id);
    }

    @GetMapping("/findAll")
    public List<UserwebProject> findAll(){
        return userwebProjectService.findAll();
    }

    @GetMapping("/projectsByUserweb/{user_name}")
    public List<String> projectsByUserweb(@PathVariable String user_name){
        return userwebProjectService.projectsByUserweb(user_name);
    }
}
