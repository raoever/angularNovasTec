package com.example.angularnovastec.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_vaga")
public class Vaga implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cargo;
    private double remuneracao;
    private boolean valeTransporte;
    private boolean valeRefeicao;
    private String observacao;
    private String turno;
    private String formaContratacao;
    private String uf;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    public Vaga() {
    }

    public Vaga(Long id, String cargo, double remuneracao, boolean valeTransporte, boolean valeRefeicao, String observacao, String turno, String formaContratacao, String uf, Empresa empresa) {
        this.id = id;
        this.cargo = cargo;
        this.remuneracao = remuneracao;
        this.valeTransporte = valeTransporte;
        this.valeRefeicao = valeRefeicao;
        this.observacao = observacao;
        this.turno = turno;
        this.formaContratacao = formaContratacao;
        this.uf = uf;
        this.empresa = empresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public boolean isValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(boolean valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public boolean isValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao(boolean valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFormaContratacao() {
        return formaContratacao;
    }

    public void setFormaContratacao(String formaContratacao) {
        this.formaContratacao = formaContratacao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "id=" + id +
                ", cargo='" + cargo + '\'' +
                ", remuneracao=" + remuneracao +
                ", valeTransporte=" + valeTransporte +
                ", valeRefeicao=" + valeRefeicao +
                ", observacao='" + observacao + '\'' +
                ", turno='" + turno + '\'' +
                ", formaContratacao='" + formaContratacao + '\'' +
                ", uf='" + uf + '\'' +
                ", empresa=" + empresa +
                '}';
    }
}
