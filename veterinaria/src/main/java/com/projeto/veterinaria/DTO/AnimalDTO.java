package com.projeto.veterinaria.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTO {
    private Long id;
    private String nome;
    private String especie;
    private String raca;
    private Integer idade;
    private String sexo;
    private Double peso;
}
