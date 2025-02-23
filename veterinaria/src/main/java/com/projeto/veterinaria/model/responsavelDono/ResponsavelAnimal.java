package com.projeto.veterinaria.model.responsavelDono;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "responsavelAnimal")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsavelAnimal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = false, nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(unique = true, nullable = false)
    private String telefone;

    @Column(unique = false, nullable = false)
    private String email;

    @Column(unique = false, nullable = true)
    private LocalDate ultimaConsulta;

    @Column(unique = false, nullable = false)
    private int numeroAnimal;
}
