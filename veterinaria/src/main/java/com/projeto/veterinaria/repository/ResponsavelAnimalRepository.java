package com.projeto.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.veterinaria.model.responsavelDono.ResponsavelAnimal;

@Repository
public interface ResponsavelAnimalRepository extends JpaRepository<ResponsavelAnimal, Long>{
    
}
