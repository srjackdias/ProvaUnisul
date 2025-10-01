package com.bancoProject.banco.dto.req;

import java.util.List;

public class CreateUsuarioDto {


    
    private String nome;
    private String senha;
    private String tipo;
    private CreateCandidatoDto candidato;
    private List<CreateVagaDto> vaga;
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
    public CreateCandidatoDto getCandidato() {
        return candidato;
    }
    public void setCandidato(CreateCandidatoDto candidato) {
        this.candidato = candidato;
    }
    public List<CreateVagaDto> getVaga() {
        return vaga;
    }
    public void setVaga(List<CreateVagaDto> vaga) {
        this.vaga = vaga;
    }

  
    



}
