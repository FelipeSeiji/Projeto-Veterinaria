package com.projeto.veterinaria.model.pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name= "pessoa")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder(access = AccessLevel.PRIVATE)
public class Pessoa {
    @Id
    @ToString.Exclude
    private Long id;

    private String nome;

    private String cpf;

    private String email;
}
