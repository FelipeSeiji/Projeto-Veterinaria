package com.projeto.veterinaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.veterinaria.model.animal.Animal;
import com.projeto.veterinaria.records.AnimalRecord;
import com.projeto.veterinaria.repository.AnimalRepository;
import com.projeto.veterinaria.service.exception.ResourceNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    /* CRUD do objeto Animal */

    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

    public Animal findById(Long id){
        Optional<Animal> animal = this.animalRepository.findById(id);
        return animal.orElseThrow(() -> new ResourceNotFoundException("Animal not found for ID: " + id));
    }

    @Transactional
    public Animal insert(AnimalRecord data){
        Animal animal = new Animal(data);
        return animalRepository.save(animal);
    }

    @Transactional
    public void delete(Long id){
        Animal animal = findById(id);
        animalRepository.delete(animal);
    }

    @Transactional
    public Animal update(Long id, Animal obj){
        Animal animal = findById(id);

        animal.setNome(obj.getNome());
        animal.setEspecie(obj.getEspecie());
        animal.setRaca(obj.getRaca());
        animal.setIdade(obj.getIdade());
        animal.setSexo(obj.getSexo());
        animal.setPeso(obj.getPeso());

        return animalRepository.save(animal);
    }
}
