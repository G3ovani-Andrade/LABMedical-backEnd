package com.LABMedical.LABMedical.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UUID;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false,length = 9)
    private String cep;
    @Column(nullable = false,length = 19)
    private String cidade;
    @Column(nullable = false,length = 14)
    private String estado;
    @Column(nullable = false,length = 200)
    private String logradouro;
    @Column(nullable = false,length = 20)
    private int numero;
    @Column(length = 100)
    private String complemento;
    @Column(nullable = false,length = 250)
    private String bairro;
    @Column(length = 255)
    private String pontoReferencia;

    @ManyToOne
    @JoinColumn(name="pessoa_id",nullable = false)
    private List<Pessoa> pessoas;

}
