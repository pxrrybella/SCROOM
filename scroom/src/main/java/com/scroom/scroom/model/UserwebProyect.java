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
@Entity(name = "UserwebProyect")
public class UserwebProyect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userwebproyect_id;

    @Column(name = "userweb_id")
    private Integer userweb_id;

    @Column(name = "proyect_id")
    private Integer proyect_id;
    
}
