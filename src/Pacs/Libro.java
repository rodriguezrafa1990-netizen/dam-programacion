package Pacs;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean disponible;

    public Libro(String titulo, String autor, int numPaginas, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}