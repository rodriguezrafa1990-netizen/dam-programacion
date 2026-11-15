package Pacs;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private int diasPrestamo;

    public Prestamo(Libro libro, Usuario usuario, int diasPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.diasPrestamo = diasPrestamo;
        this.libro.setDisponible(false); // al prestarlo deja de estar disponible
    }

    public void mostrarDiasPrestamo() {
        System.out.println("El libro \"" + libro.getTitulo() + "\" está prestado a "
                + usuario.getNombre() + " durante " + diasPrestamo + " días.");
    }

    public void modificarDiasPrestamo(int nuevosDias) {
        this.diasPrestamo = nuevosDias;
    }
}