package com.machado.ederson.emarket.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name="users")
@NoArgsConstructor
@SequenceGenerator(name = "SEQ", sequenceName = "SEQ_USER", allocationSize = 1)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
    private Long id;

    private String name;

    private LocalDate birthDate;

    private String email;

    @JsonIgnore
    private String password;

    private String photoUrl;

    private boolean active;

    private Perfil perfil;

}
