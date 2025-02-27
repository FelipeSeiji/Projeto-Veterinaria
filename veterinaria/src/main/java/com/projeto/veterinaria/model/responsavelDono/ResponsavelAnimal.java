package com.projeto.veterinaria.model.responsavelDono;

import com.projeto.veterinaria.model.pessoa.Pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "responsavel_Animal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class ResponsavelAnimal extends Pessoa{
    @NotBlank 
    @Size(max = 200)
    private String endereco;
}
