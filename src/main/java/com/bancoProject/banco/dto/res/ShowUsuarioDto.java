package com.bancoProject.banco.dto.res;

import java.util.List;

import com.bancoProject.banco.dto.req.CreateCandidatoDto;
import com.bancoProject.banco.dto.req.CreateVagaDto;

public class ShowUsuarioDto {
    

    private Long id_usuario;
       
    private String nome;
    private String senha;
    private String tipo;
    private ShowCandidatoDto candidato;
    private List<ShowVagaDto> vaga;
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
    public ShowCandidatoDto getCandidato() {
        return candidato;
    }
    public void setCandidato(ShowCandidatoDto candidato) {
        this.candidato = candidato;
    }
    public List<ShowVagaDto> getVaga() {
        return vaga;
    }
    public void setVaga(List<ShowVagaDto> vaga) {
        this.vaga = vaga;
    }



 
    
 

 
    
}
