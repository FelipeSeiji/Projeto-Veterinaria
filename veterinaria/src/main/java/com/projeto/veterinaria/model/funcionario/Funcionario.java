package com.projeto.veterinaria.model.funcionario;

import com.projeto.veterinaria.model.pessoa.Pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario extends Pessoa{
    @NotBlank 
    @Size(max = 50)
    private String cargo;

    @Positive 
    @NotNull
    private Double salario;
}
