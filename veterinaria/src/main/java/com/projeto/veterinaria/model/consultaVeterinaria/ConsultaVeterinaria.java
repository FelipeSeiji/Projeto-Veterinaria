package com.projeto.veterinaria.model.consultaVeterinaria;

import java.util.ArrayList;
import java.util.List;

import com.projeto.veterinaria.model.agendamento.Agendamento;
import com.projeto.veterinaria.model.animal.Animal;
import com.projeto.veterinaria.model.pagamento.Pagamento;
import com.projeto.veterinaria.model.registro.Registro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "consultaVeterinaria")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ConsultaVeterinaria extends Registro{
    @Column(columnDefinition = "TEXT")
    private String motivo;

    @NotBlank 
    @Size(max = 1000)
    private String tratamentoRecomendado;

    @Lob
    @Size(max = 1000)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    @OneToOne
    private Agendamento agendamento;

    @OneToMany
    @Builder.Default
    private List<Pagamento> pagamento = new ArrayList<>();
}
