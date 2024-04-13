package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    // Setters
    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getters
    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }
}