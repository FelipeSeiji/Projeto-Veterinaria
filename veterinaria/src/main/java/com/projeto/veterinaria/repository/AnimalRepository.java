package com.projeto.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.veterinaria.model.animal.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
