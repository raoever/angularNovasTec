package com.example.angularnovastec.model.dao;

import com.example.angularnovastec.model.entity.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VagaRepository  extends JpaRepository<Vaga, Long> {

    @Query("select v from Vaga v where v.empresa.nomeEmpresa like %?1")
    List<Vaga> findByEmpresa(String empresa);

    @Query("select v from Vaga v where v.cargo like %?1")
    List<Vaga> findByCargo(String cargo);

    @Query("select v from Vaga v where v.empresa.cidade like %?1")
    List<Vaga> findByCidade(String cidade);

    @Query("select v from Vaga v where v.uf like %?1")
    List<Vaga> findByUf(String uf);

}
