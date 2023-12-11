package com.LABMedical.LABMedical.models;

import com.LABMedical.LABMedical.enums.EspecializacaoClinica;
import com.LABMedical.LABMedical.enums.EstadoNoSistema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Medico extends Pessoa{
    @Column(nullable = false)
    private String crmUf;

    @Enumerated
    @Column(nullable = false)
    private EspecializacaoClinica especializacaoClinica;

    @Enumerated
    @Column(nullable = false)
    private EstadoNoSistema estadoNoSistema;

    @Column(nullable = false)
    private int totalAtendimentosRealizados;
}
