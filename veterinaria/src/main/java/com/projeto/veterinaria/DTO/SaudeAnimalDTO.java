package com.projeto.veterinaria.DTO;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaudeAnimalDTO {
private Long id;
    private LocalDate dataRegistro;
    private String historicoMedico;
    private List<String> vacinas;
    private List<String> alergias;
    private List<String> cirurgias;
    private List<String> medicacoes;
    private Long animalId;
}
