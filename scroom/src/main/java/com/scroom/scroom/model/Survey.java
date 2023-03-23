package com.scroom.scroom.model;

import java.sql.Date;

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
@Entity(name="Survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer survey_id;
    
    @Column(name = "userweb_id")
    private Integer userweb_id;

    @Column(name = "date")
    private Date date;

    @Column(name = "rol")
    private String rol;

    @Column(name = "answer1")
    private String answer1;

    @Column(name = "answer2")
    private String answer2;

    @Column(name = "answer3")
    private String answer3;

    @Column(name = "answer4")
    private String answer4;
}
