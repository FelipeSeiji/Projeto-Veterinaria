package com.projeto.veterinaria.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDTO {
    private Long id;
    private String nome;
    private String sobrenome;
    private String cargo;
    private Double salario;
}
