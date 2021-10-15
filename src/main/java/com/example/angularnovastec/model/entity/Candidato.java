package com.example.angularnovastec.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_candidato")
public class Candidato implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCandidato;
    private String loginCandidato;
    private String senha;
    private String cpf;
    private String rg;
    private LocalDateTime dataEmissaoRG;
    private LocalDateTime dataNascimento;
    private String sexo;
    private String estadoCivil;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String email;
    private String telefone;
    private Boolean notificacao;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Experiencia> experiencias = new ArrayList();

    public Candidato() {
    }

    public Candidato(Long id, String nomeCandidato, String loginCandidato, String senha, String cpf, String rg, LocalDateTime dataEmissaoRG, LocalDateTime dataNascimento, String sexo, String estadoCivil, String endereco, String bairro, String cidade, String uf, String cep, String email, String telefone, Boolean notificacao, List<Experiencia> experiencias) {
        this.id = id;
        this.nomeCandidato = nomeCandidato;
        this.loginCandidato = loginCandidato;
        this.senha = senha;
        this.cpf = cpf;
        this.rg = rg;
        this.dataEmissaoRG = dataEmissaoRG;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
        this.notificacao = notificacao;
        this.experiencias = experiencias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getLoginCandidato() {
        return loginCandidato;
    }

    public void setLoginCandidato(String loginCandidato) {
        this.loginCandidato = loginCandidato;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDateTime getDataEmissaoRG() {
        return dataEmissaoRG;
    }

    public void setDataEmissaoRG(LocalDateTime dataEmissaoRG) {
        this.dataEmissaoRG = dataEmissaoRG;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "id=" + id +
                ", nomeCandidato='" + nomeCandidato + '\'' +
                ", loginCandidato='" + loginCandidato + '\'' +
                ", senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataEmissaoRG=" + dataEmissaoRG +
                ", dataNascimento=" + dataNascimento +
                ", sexo='" + sexo + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", cep='" + cep + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", notificacao=" + notificacao +
                ", experiencias=" + experiencias +
                '}';
    }
}
