package com.bancoProject.banco.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "usuario")
public class UsuarioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(name = "nome")
    private String nome;


    @Column(name = "senha")
    private String senha;


    @Column(name = "tipo")
    private String tipo;

   
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private CandidatoEntity candidato;

    

    @OneToMany(mappedBy = "usuario")
    private List <VagaEntity> vaga;

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public CandidatoEntity getCandidato() {
        return candidato;
    }

    public void setCandidato(CandidatoEntity candidato) {
        this.candidato = candidato;
    }

    public List<VagaEntity> getVaga() {
        return vaga;
    }

    public void setVaga(List<VagaEntity> vaga) {
        this.vaga = vaga;
    }


  






    
}
