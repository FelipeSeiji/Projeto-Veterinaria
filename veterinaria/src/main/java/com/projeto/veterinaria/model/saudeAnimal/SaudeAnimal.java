package com.projeto.veterinaria.model.saudeAnimal;

import java.util.List;

import com.projeto.veterinaria.model.registro.Registro;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "saudeAnimal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaudeAnimal extends Registro{
    @Lob
    private String historicoMedico;

    @ElementCollection
    private List<String> vacinas;

    @ElementCollection
    private List<String> alergias;

    @ElementCollection
    private List<String> cirurgias;
    
    @ElementCollection
    private List<String> medicacoes;
}
