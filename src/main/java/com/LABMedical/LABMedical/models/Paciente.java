package com.LABMedical.LABMedical.models;

import com.LABMedical.LABMedical.enums.StatusAtendimento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Paciente extends Pessoa{

    @Column(nullable = false)
    private String contatoEmergencia;

    @Column
    private String alergias;

    @Column
    private String cuidadosEspecificos;

    @Enumerated
    @Column(nullable = false)
    private StatusAtendimento statusAtendimento;

    @Column(nullable = false)
    private int totalAtendimentosRealizados;
    @OneToMany(mappedBy = "paciente",cascade = CascadeType.ALL)
    private List<Endereco> enderecos;
}
