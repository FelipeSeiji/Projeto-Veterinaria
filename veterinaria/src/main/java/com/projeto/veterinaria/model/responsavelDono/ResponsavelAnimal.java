package com.projeto.veterinaria.model.responsavelDono;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "responsavelAnimal")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = {"cpf", "telefone"})
public class ResponsavelAnimal implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @Column(unique = true, nullable = false, length = 11)
    @NotBlank(message = "CPF é obrigatório")
    @Size(min = 11, max = 11, message = "CPF deve ter 11 caracteres")
    private String cpf;

    @Column(unique = true, nullable = false, length = 15)
    @NotBlank(message = "Telefone é obrigatório")
    private String telefone;

    @Column(unique = false, nullable = false)
    @Email(message = "Email inválido")
    @NotBlank(message = "Email é obrigatório")
    private String email;

    @Column(nullable = true)
    private LocalDate ultimaConsulta;

    @Column(nullable = false)
    private int numeroAnimal;
}
