package com.example.angularnovastec.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_experiencia")
public class Experiencia implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeEmpresa;
    private String cargo;
    private String tarefasExecutadas;
    private String formaContratacao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataConclusao;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_candidato")
    private Candidato candidato;

    public Experiencia() {
    }

    public Experiencia(Long id, String nomeEmpresa, String cargo, String tarefasExecutadas, String formaContratacao, LocalDateTime dataInicio, LocalDateTime dataConclusao, Candidato candidato) {
        this.id = id;
        this.nomeEmpresa = nomeEmpresa;
        this.cargo = cargo;
        this.tarefasExecutadas = tarefasExecutadas;
        this.formaContratacao = formaContratacao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.candidato = candidato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTarefasExecutadas() {
        return tarefasExecutadas;
    }

    public void setTarefasExecutadas(String tarefasExecutadas) {
        this.tarefasExecutadas = tarefasExecutadas;
    }

    public String getFormaContratacao() {
        return formaContratacao;
    }

    public void setFormaContratacao(String formaContratacao) {
        this.formaContratacao = formaContratacao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    @Override
    public String toString() {
        return "Experiencia{" +
                "id=" + id +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", cargo='" + cargo + '\'' +
                ", tarefasExecutadas='" + tarefasExecutadas + '\'' +
                ", formaContratacao='" + formaContratacao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataConclusao=" + dataConclusao +
                ", candidato=" + candidato +
                '}';
    }
}
