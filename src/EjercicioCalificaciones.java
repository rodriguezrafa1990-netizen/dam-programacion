import java.util.Scanner;

public class EjercicioCalificaciones {
    public static void main(String[] args) {
        System.out.println("Introduce una nota: ");

        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        if (nota < 5) {
            System.out.println("Suspenso.");
        } else if (nota < 7) {
            System.out.println("Aprobado");

        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota <= 10) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota incorrecta.");
        }
    }
}

