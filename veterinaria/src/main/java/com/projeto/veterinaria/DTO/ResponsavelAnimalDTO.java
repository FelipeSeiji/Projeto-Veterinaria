package com.projeto.veterinaria.DTO;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ResponsavelAnimalDTO(
    @NotBlank @Size(max=100) String nome,
    @NotBlank @Size(max=14) String cpf,
    @NotBlank @Size(max=20) String telefone,
    @Email @Size(max=100) String email,
    @NotBlank @Size(max=200) String endereco,
    @NotNull List<Long> animaisIds
) {
    
}
