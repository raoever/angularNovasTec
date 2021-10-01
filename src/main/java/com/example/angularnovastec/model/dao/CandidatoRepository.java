package com.example.angularnovastec.model.dao;

import com.example.angularnovastec.model.entity.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository  extends JpaRepository<Candidato, Long> {
}
