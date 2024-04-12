package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;

    // Métodos
    public void reproduz() {
        this.totalReproducoes++;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

}
