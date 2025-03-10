package com.projeto.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.veterinaria.model.funcionario.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
    
}
