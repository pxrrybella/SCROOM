package com.scroom.scroom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.scroom.scroom.model.Company;

import com.scroom.scroom.repository.CompanyRepository;



@Service
@Transactional

public class CompanyService {

    private CompanyRepository CompanyRepository;
    public CompanyService(CompanyRepository CompanyRepository){
        this.CompanyRepository = CompanyRepository;
    }

    public void saveCompany (Company company){
        this.CompanyRepository.save(company);
    }

    public void updateCompany (Company company){
        this.CompanyRepository.save(company);
    }

    public void deleteCompany(Integer id){
        CompanyRepository.deleteById(id);
    }

    public List<Company> findAll(){
        return CompanyRepository.findAll();
    }

    
    
    
}
