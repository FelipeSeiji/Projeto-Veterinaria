package com.projeto.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.veterinaria.model.saudeAnimal.SaudeAnimal;

@Repository
public interface SaudeAnimalRepository extends JpaRepository<SaudeAnimal, Long>{
    
}
