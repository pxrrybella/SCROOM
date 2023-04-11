package com.scroom.scroom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Userweb_Project")
public class UserwebProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userweb_project_id;

    @Column(name = "userweb_id")
    private Integer userweb_id;

    @Column(name = "project_id")
    private Integer project_id;
    
}
