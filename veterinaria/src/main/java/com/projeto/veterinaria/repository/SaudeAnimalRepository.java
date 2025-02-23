package com.projeto.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.veterinaria.model.saudeAnimal.SaudeAnimal;

public interface SaudeAnimalRepository extends JpaRepository<SaudeAnimal, Long>{
    
}
