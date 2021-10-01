package com.example.angularnovastec.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_empresa")
public class Empresa implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String nomeEmpresa;
    private String loginEmpresa;
    private String senha;
    private String cnpj;
    private String atuacao;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String email;
    private String telefone;
    private Boolean notificacao;
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.PERSIST)
    private List<Vaga> vagas = new ArrayList();

    public Empresa() {
    }

    public Empresa(Long id, String nomeEmpresa, String loginEmpresa, String senha, String cnpj, String atuacao, String endereco, String bairro, String cidade, String uf, String cep, String email, String telefone, Boolean notificacao, List<Vaga> vagas) {
        this.id = id;
        this.nomeEmpresa = nomeEmpresa;
        this.loginEmpresa = loginEmpresa;
        this.senha = senha;
        this.cnpj = cnpj;
        this.atuacao = atuacao;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
        this.notificacao = notificacao;
        this.vagas = vagas;
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

    public String getLoginEmpresa() {
        return loginEmpresa;
    }

    public void setLoginEmpresa(String loginEmpresa) {
        this.loginEmpresa = loginEmpresa;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(Boolean notificacao) {
        this.notificacao = notificacao;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", loginEmpresa='" + loginEmpresa + '\'' +
                ", senha='" + senha + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", atuacao='" + atuacao + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", cep='" + cep + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", notificacao=" + notificacao +
                ", vagas=" + vagas +
                '}';
    }
}
