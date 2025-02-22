package com.projeto.veterinaria.model.animal;

import jakarta.persistence.Entity;
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
    private Long id;
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String sexo;
    private double peso;
}
