package com.bancoProject.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancoProject.banco.entities.CandidatoEntity;



@Repository
public interface CandidatoRepository extends JpaRepository<CandidatoEntity, Long> {
    


}
