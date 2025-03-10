package com.projeto.veterinaria.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoDTO {
    private Long id;
    private Double valor;
    private LocalDate dataPagamento;
    private String tipoPagamento;
    private Long consultaId;
}
