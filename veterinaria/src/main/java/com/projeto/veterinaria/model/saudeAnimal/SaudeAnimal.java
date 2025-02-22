package com.projeto.veterinaria.model.saudeAnimal;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "saudeAnimal")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaudeAnimal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = false, nullable = true)
    private String historicoMedico;

    @Column(unique = false, nullable = true)
    private List<String> vacinas;

    @Column(unique = false, nullable = true)
    private List<String> alergias;

    @Column(unique = false, nullable = true)
    private List<String> cirurgias;
    
    @Column(unique = false, nullable = true)
    private List<String> medicacoes;
}
