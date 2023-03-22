package com.scroom.scroom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Proyect")
public class Proyect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proyect_id;
    
    @Column(name = "admin_name")
    private String admin_name;

    @Column(name = "proyect_name")
    private String proyect_name;
}
