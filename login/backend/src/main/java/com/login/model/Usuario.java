package com.login.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "usuario")
@Entity(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Campo ID
    private Integer id;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Column(name = "senha", nullable = false, length = 50)
    private String senha;
}
