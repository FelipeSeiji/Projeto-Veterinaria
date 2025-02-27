package com.projeto.veterinaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.veterinaria.DTO.AnimalDTO;
import com.projeto.veterinaria.model.animal.Animal;
import com.projeto.veterinaria.repository.AnimalRepository;
import com.projeto.veterinaria.service.exception.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    /* CRUD do objeto Animal */
    public List<Animal> findAll(){
        return repository.findAll();
    }

    public Animal findById(Long id){
        Optional<Animal> animal = this.repository.findById(id);
        return animal.orElseThrow(() -> new RuntimeException(
            "Animal not found for ID: " + id
        ));
    }

    @Transactional
    public Animal insert(AnimalDTO data){
        Animal animal = new Animal(data);
        this.saveAnimal(animal);
        return animal;
    }

    @Transactional
    public void saveAnimal(Animal animal){
        this.repository.save(animal);
    }

    @Transactional
    public void delete(Long id){
        try{
            repository.deleteById(id);
        }
        catch(Exception e){
            throw new RuntimeException();
        }
    }

    @Transactional
    public Animal update(Long id, Animal obj){
        try{
            Animal animal = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
            animal.setNome(obj.getNome());
            return repository.save(animal);
        }
        catch(EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }
    }

    @Transactional
    private void updateData(Animal animal, Animal obj){
        animal.setNome(obj.getNome());
        animal.setEspecie(obj.getEspecie());
        animal.setRaca(obj.getRaca());
        animal.setIdade(obj.getIdade());
        animal.setSexo(obj.getSexo());
        animal.setPeso(obj.getPeso());
    }
}
