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

    @Column(name = "date")
    private Date date;

    @Column(name = "answer1")
    private Integer answer1;

    @Column(name = "answer2")
    private Integer answer2;

    @Column(name = "answer3")
    private Integer answer3;

    @Column(name = "answer4")
    private Integer answer4;

    @Column(name = "answer5")
    private Integer answer5;

    @Column(name = "answer6")
    private Integer answer6;

    @Column(name = "answer7")
    private Integer answer7;

    @Column(name = "answer8")
    private Integer answer8;

    @Column(name = "answer9")
    private Integer answer9;

    @Column(name = "answer10")
    private Integer answer10;
    
    @Column(name = "userweb_id")
    private Integer userweb_id;

    @Column(name = "sprint_id")
    private Integer sprint_id;

    @Column(name = "company_id")
    private Integer company_id;
}
