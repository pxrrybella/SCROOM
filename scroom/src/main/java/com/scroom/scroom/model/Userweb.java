package com.scroom.scroom.model;

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
@Entity(name = "Userweb")
public class Userweb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Integer usuario_id;

    @Size(max = 25, message = "Debe introducir máximo 25 caracteres")
    private String userName;

    @Size(max = 25, message = "Debe introducir máximo 25 caracteres")
    private String lastName;

    private String email;

    @Size(min = 8, message = "Debe introducir mínimo 25 caracteres")
    private String userPassword;

    //private boolean accountNonLocked;
        
}
