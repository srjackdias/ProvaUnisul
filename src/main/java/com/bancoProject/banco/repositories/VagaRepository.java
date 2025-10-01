package com.bancoProject.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancoProject.banco.entities.VagaEntity;


@Repository
public interface VagaRepository extends JpaRepository <VagaEntity, Long>{
    
}
