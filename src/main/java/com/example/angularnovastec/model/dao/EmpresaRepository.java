package com.example.angularnovastec.model.dao;

import com.example.angularnovastec.model.entity.Empresa;
import com.example.angularnovastec.model.entity.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    @Query("select e from Empresa e where e.nomeEmpresa like %?1")
    Empresa findByNomeEmpresa(String empresa);

    @Query("select e from Empresa e where e.uf like %?1")
    Empresa findByUfEmpresa(String uf);

    @Query("select e from Empresa e where e.cidade like %?1")
    Empresa findByCidadeEmpresa(String cidade);

    @Query("select e from Empresa e where e.atuacao like %?1")
    Empresa findByAtuacaoEmpresa(String atuacao);

}
