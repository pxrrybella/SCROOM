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

import com.scroom.scroom.model.UserwebProyect;
import com.scroom.scroom.service.UserwebProyectService;

@Controller
@CrossOrigin("*")
@RestController
@RequestMapping("/userwebproyect")
public class UserwebProyectController {
    private UserwebProyectService userwebProyectService;

    public UserwebProyectController (@Autowired UserwebProyectService userwebProyectService){
        this.userwebProyectService = userwebProyectService;
    }

    @PostMapping("/save")
    public void saveUserwebProyect(@RequestBody UserwebProyect userwebProyect){
        userwebProyectService.saveUserwebProyect(userwebProyect);
    }

    @PutMapping("/update")
    public void updateUserwebProyect(@RequestBody UserwebProyect userwebProyect){
        userwebProyectService.updateUserwebProyect(userwebProyect);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserwebProyect(@PathVariable Integer id){
        userwebProyectService.deleteUserwebProyect(id);
    }

    @GetMapping("/findAll")
    public List<UserwebProyect> findAll(){
        return userwebProyectService.findAll();
    }
}
