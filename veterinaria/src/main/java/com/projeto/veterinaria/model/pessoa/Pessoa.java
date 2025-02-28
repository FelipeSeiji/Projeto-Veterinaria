package com.projeto.veterinaria.model.pessoa;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ToString.Exclude
    protected Long id;

    @Column(nullable = false, length = 100)
    protected String nome;

    @Column(nullable = false, length = 100)
    protected String sobrenome;

    @Pattern(regexp = "^[0-9]{11}$", message = "CPF deve conter 11 dígitos")
    @Column(unique = true, nullable = false)
    protected String cpf;

    @Pattern(regexp = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$", message = "Telefone inválido")
    protected String telefone;

    @Column(unique = false, nullable = false, length = 100)
    @Email(message = "Email inválido")
    protected String email;
}
