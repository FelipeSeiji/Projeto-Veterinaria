package com.projeto.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.veterinaria.model.responsavelDono.ResponsavelAnimal;

public interface ResponsavelAnimalRepository extends JpaRepository<ResponsavelAnimal, Long>{
    
}
