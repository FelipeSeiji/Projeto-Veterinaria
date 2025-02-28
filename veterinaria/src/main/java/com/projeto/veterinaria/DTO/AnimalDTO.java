package com.projeto.veterinaria.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record AnimalDTO(
    @NotBlank @Size(max = 50) String nome, 
    @NotBlank @Size(max = 50) String especie, 
    @NotBlank @Size(max = 50) String raca, 
    @Positive int idade, 
    @NotBlank @Size(max = 15) String sexo, 
    @Positive double peso
    ) {
        
}
