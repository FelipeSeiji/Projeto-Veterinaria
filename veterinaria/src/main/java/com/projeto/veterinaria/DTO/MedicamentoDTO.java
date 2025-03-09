package com.projeto.veterinaria.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicamentoDTO {
    private Long id;
    private String nome;
    private String dosagem;
    private String descricao;
}
