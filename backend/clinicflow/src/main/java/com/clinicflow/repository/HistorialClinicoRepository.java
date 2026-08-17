package com.clinicflow.repository;

import com.clinicflow.model.HistoriaClinico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistorialClinicoRepository extends JpaRepository<HistoriaClinico, Integer>{
    
}
