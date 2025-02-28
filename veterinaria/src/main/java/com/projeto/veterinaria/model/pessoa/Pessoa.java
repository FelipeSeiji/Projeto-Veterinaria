package com.projeto.veterinaria.model.pessoa;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ToString.Exclude
    protected Long id;

    @Column(nullable = false, length = 100)
    protected String nome;

    @Column(nullable = false, length = 100)
    protected String sobrenome;

    @Column(unique = true, nullable = false, length = 15)  
    protected String cpf;

    @Column(unique = true, nullable = false, length = 15)
    protected String telefone;

    @Column(unique = false, nullable = false, length = 100)
    protected String email;
}
