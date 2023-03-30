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
@Entity(name = "Userweb")
public class Userweb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userweb_id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "user_password")
    private String user_password;

    @Column(name = "company_position")
    private String company_position;

    @Column(name = "company_id")
    private Integer company_id;

    //private boolean accountNonLocked;
        
}
