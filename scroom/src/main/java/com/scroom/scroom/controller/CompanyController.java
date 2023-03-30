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

import com.scroom.scroom.model.Company;
import com.scroom.scroom.service.CompanyService;


@Controller
@CrossOrigin("*")
@RestController
@RequestMapping("/company")
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(@Autowired CompanyService companyService){
        this.companyService = companyService;
    }

    @PostMapping("/save")
    public void saveCompany(@RequestBody Company company){
        companyService.saveCompany(company);
    }

    @PutMapping("/update")
    public void updateCompany(@RequestBody Company company){
        companyService.updateCompany(company);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable Integer id){
        companyService.deleteCompany(id);
    }

    @GetMapping("/findAll")
    public List<Company> findAll(){
        return companyService.findAll();
    }
    
}
