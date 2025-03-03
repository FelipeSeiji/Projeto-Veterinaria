package com.projeto.veterinaria.model.responsavelDono;

import java.util.HashSet;
import java.util.Set;

import com.projeto.veterinaria.model.animal.Animal;
import com.projeto.veterinaria.model.pessoa.Pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
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

    @ManyToMany(mappedBy = "responsavelAnimal")
    @Builder.Default
    private Set<Animal> animal = new HashSet<>();
}
