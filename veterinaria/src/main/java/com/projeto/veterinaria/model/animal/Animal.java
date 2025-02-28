package com.projeto.veterinaria.model.animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projeto.veterinaria.DTO.AnimalDTO;
import com.projeto.veterinaria.model.consultaVeterinaria.ConsultaVeterinaria;
import com.projeto.veterinaria.model.responsavelDono.ResponsavelAnimal;
import com.projeto.veterinaria.model.saudeAnimal.SaudeAnimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "animal")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder(access = AccessLevel.PRIVATE)
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    // Atributos do animal
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ToString.Exclude
    private Long id;

    @Column(unique = false, length = 50)
    @NotBlank(message = "Nome não pode ser vazio")
    @Size(max = 50, message = "Nome deve ter no máximo 50 caracteres")
    private String nome;

    @Column(unique = false, nullable = false, length = 50)
    @NotBlank(message = "Espécie não pode ser vazia")
    @Size(max = 50, message = "Espécie deve ter no máximo 50 caracteres")
    private String especie;

    @Column(unique = false, nullable = false, length = 50)
    @NotBlank(message = "Raça não pode ser vazia")
    @Size(max = 50, message = "Raça deve ter no máximo 50 caracteres")
    private String raca;

    @Column(unique = false, nullable = false)
    @NotNull(message = "Idade não pode ser nula")
    @Positive(message = "Idade deve ser maior que 0")
    private int idade;

    @Column(unique = false, nullable = false, length = 15)
    @NotBlank(message = "Sexo não pode ser vazio")
    @Size(max = 15, message = "Sexo deve ter no máximo 15 caracteres")
    private String sexo;

    @Column(unique = false, nullable = false)
    @NotNull(message = "Peso não pode ser nulo")
    @Positive(message = "Peso deve ser maior que 0")
    private double peso;

    @OneToOne(mappedBy = "animal", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private SaudeAnimal saudeAnimal = new SaudeAnimal();

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    @Builder.Default
    private List<ConsultaVeterinaria> consultaVeterinarias = new ArrayList<>();

    @ManyToMany
    @Builder.Default
    @JoinTable(name = "animal_responsavelAnimal", joinColumns = @JoinColumn(name = "animal_id"), inverseJoinColumns = @JoinColumn(name = "responsavel_id"))
    private Set<ResponsavelAnimal> responsavelAnimal = new HashSet<>();

    public Animal(AnimalDTO data) {
        this.nome = data.nome();
        this.especie = data.especie();
        this.raca = data.raca();
        this.idade = data.idade();
        this.sexo = data.sexo();
        this.peso = data.peso();
    }
}
