package com.projeto.veterinaria.model.funcionario;

import com.projeto.veterinaria.model.pessoa.Pessoa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "funcionario")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Funcionario extends Pessoa{
    @Column(length = 50, nullable = false)
    @NotBlank 
    @Size(max = 50)
    private String cargo;

    @Positive
    private Double salario;


}
