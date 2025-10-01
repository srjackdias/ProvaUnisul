package com.bancoProject.banco.entities;

import com.bancoProject.banco.dto.req.CreateCandidatoDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name= "candidato")
public class CandidatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_candidato;



    @Column(name = "titulo")
    private String titulo;


    @Column(name = "funçaovaga", nullable = true)
    private String funçaovaga;



    @Column(name = "cidade")
    private String cidade;


    @Column(name = "descricao")
    private String descricao;


    @OneToOne

    
    @JoinColumn(name = "usuario_id",nullable = true)

    
    private UsuarioEntity usuario;


    public Long getId_candidato() {
        return id_candidato;
    }


    public void setId_candidato(Long id_candidato) {
        this.id_candidato = id_candidato;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getFunçaoVaga() {
        return funçaovaga;
    }


    public void setFunçaoVaga(String funçaoVaga) {
        this.funçaovaga = funçaoVaga;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public UsuarioEntity getUsuario() {
        return usuario;
    }


    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }



    

    
}
