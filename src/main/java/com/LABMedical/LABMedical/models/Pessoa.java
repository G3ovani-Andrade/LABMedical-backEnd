package com.LABMedical.LABMedical.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@MappedSuperclass
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(length = 100)
    private String nomeCompleto;

    @Column(length = 20)
    private String genero;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(length = 11,nullable = false)
    private String cpf;

    @Column(length = 20,nullable = false)
    private String rg;

    @Column(length = 15,nullable = false)
    private String telefone;

    @Column(length = 100,nullable = false)
    private String email;

}
