package com.example.angularnovastec.model.dao;

import com.example.angularnovastec.model.entity.Candidato;
import com.example.angularnovastec.model.entity.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CandidatoRepository  extends JpaRepository<Candidato, Long> {

    @Query("select c, e from Candidato c, Experiencia e where c.id = e.id and e.cargo = :cargo")
    List<Candidato> findByCargoCandidato(@Param("cargo") String cargo);

    @Query("select c from Candidato c where c.cidade like %?1")
    List<Candidato> findByCargoCidade(String cidade);

    @Query("select c from Candidato c where c.uf like %?1")
    List<Candidato> findByCargoEstado(String estado);

}
