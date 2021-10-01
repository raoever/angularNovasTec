package com.example.angularnovastec.model.dao;

import com.example.angularnovastec.model.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
