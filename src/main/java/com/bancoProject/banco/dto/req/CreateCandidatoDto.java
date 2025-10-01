package com.bancoProject.banco.dto.req;

public class CreateCandidatoDto {

    private String titulo;
    private String funçaovaga;

    private String experiencia;
    private String cidade;
    private String descricao;
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
    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
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


    
}
