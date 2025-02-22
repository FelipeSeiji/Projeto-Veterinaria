package com.projeto.veterinaria.model.animal;

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
@Table(name =  "animal")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    //Atributos do animal
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = false, nullable = true, length = 50)
    private String nome;

    @Column(unique = false, nullable = false, length = 50)
    private String especie;

    @Column(unique = false, nullable = false, length = 50)
    private String raca;

    @Column(unique = false, nullable = false, length = 4)
    private int idade;

    @Column(unique = false, nullable = false, length = 15)
    private String sexo;

    @Column(unique = false, nullable = false, length = 3)
    private double peso;
}
