package com.projeto.veterinaria.model.consultaVeterinaria;

import com.projeto.veterinaria.model.registro.Registro;

import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "consultaVeterinaria")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ConsultaVeterinaria extends Registro{
    @Lob
    private String motivo;

    @NotBlank 
    @Size(max = 1000)
    private String tratamentoRecomendado;

    @Lob
    @Size(max = 1000)
    private String observacoes;
}
