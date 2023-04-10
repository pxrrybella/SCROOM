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

import com.scroom.scroom.model.Userweb;
import com.scroom.scroom.service.UserwebService;

@Controller
@CrossOrigin("*")
@RestController
@RequestMapping("/userweb")
public class UserwebController {
    private UserwebService userwebService;

    public UserwebController(@Autowired UserwebService userwebService){
        this.userwebService = userwebService;
    }

    @PostMapping("/save")
    public void saveUserweb(@RequestBody Userweb userweb){
        userwebService.saveUserweb(userweb);
    }

    @PutMapping("/update")
    public void updateUserweb(@RequestBody Userweb userweb){
        userwebService.updateUserweb(userweb);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserweb(@PathVariable Integer id){
        userwebService.deleteUserweb(id);
    }

    @GetMapping("/findAll")
    public List<Userweb> findAll(){
        return userwebService.findAll();
    }

    @GetMapping("/getById/{user_name}")
    public Userweb findUserwebByUsername(@PathVariable String user_name){
        return userwebService.findUserwebByUsername(user_name);
    }

    /* @GetMapping("/findprojects/{user_name}")
    public List<Project> findProjectsByUserweb(@PathVariable String user_name){
        return userwebService.findProjectsByUserweb(user_name);
    } */
}
