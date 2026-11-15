
package Pacs;

public class Main {


    public static void main(String[] args) {
        // --- LIBRO ---
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 863, true);
        System.out.println("Libro: " + libro.getTitulo() + " / " + libro.getAutor()
                + " / " + libro.getNumPaginas() + " págs. / disponible: " + libro.isDisponible());

        libro.setTitulo("La Celestina");
        libro.setAutor("Fernando de Rojas");
        libro.setNumPaginas(250);
        libro.setDisponible(true);
        System.out.println("Libro modificado: " + libro.getTitulo() + " / " + libro.getAutor()
                + " / " + libro.getNumPaginas() + " págs. / disponible: " + libro.isDisponible());

        // --- USUARIO ---
        Usuario usuario = new Usuario("Rafa", 35, "12345678A");
        System.out.println("Usuario: " + usuario.getNombre() + " / " + usuario.getEdad()
                + " años / DNI " + usuario.getDni());

        usuario.setNombre("Rafael");
        usuario.setEdad(36);
        usuario.setDni("87654321B");
        System.out.println("Usuario modificado: " + usuario.getNombre() + " / " + usuario.getEdad()
                + " años / DNI " + usuario.getDni());

        // --- PRESTAMO ---
        Prestamo prestamo = new Prestamo(libro, usuario, 15);
        System.out.println("Disponible tras el préstamo: " + libro.isDisponible());
        prestamo.mostrarDiasPrestamo();

        prestamo.modificarDiasPrestamo(30);
        prestamo.mostrarDiasPrestamo();
    }
}