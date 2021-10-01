package com.example.angularnovastec.model.dao;

import com.example.angularnovastec.model.entity.Candidato;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Repository
public class CandidadoDAO {

    @PersistenceContext
    private EntityManager em;

    public void saveCandidato(Candidato candidato) {
        em.persist(candidato);
    }

    public Candidato pegaCandidato(int id) {
        return em.find(Candidato.class, id);
    }

    public void delCandidato(int id){
        em.remove(em.find(Candidato.class, id));
    }

}
