package com.scroom.scroom.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.scroom.scroom.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{
    
}
