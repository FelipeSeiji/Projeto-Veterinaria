package com.projeto.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.veterinaria.model.consultaVeterinaria.ConsultaVeterinaria;

@Repository
public interface ConsultaVeterinariaRepository extends JpaRepository<ConsultaVeterinaria, Long>{
    
}
