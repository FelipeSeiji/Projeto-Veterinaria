package com.projeto.veterinaria.model.pagamento;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

import com.projeto.veterinaria.model.consultaVeterinaria.ConsultaVeterinaria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "pagamento")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(access = AccessLevel.PRIVATE)
@ToString
public class Pagamento implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ToString.Exclude
    private Long id;

    @Positive
    @Column(precision = 10)
    private Double valor;

    @NotNull
    private LocalDate dataPagamento;

    @NotBlank
    @Size(max = 50)
    private String tipoPagamento;

    @ManyToOne
    @JoinColumn(name = "consulta_id")
    private ConsultaVeterinaria consultaVeterinaria;
}
