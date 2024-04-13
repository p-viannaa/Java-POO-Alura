package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;

    // Setters
    public void setAlbum(String album) {
        this.album = album;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Getters
    public String getAlbum() {
        return album;
    }

    public String getCantor() {
        return cantor;
    }

    public String getGenero() {
        return genero;
    }

}
