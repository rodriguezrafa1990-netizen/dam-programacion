import java.util.Scanner;

public class ProgramNotaFinalPonderada {
    public static void main(String[] args) {
        System.out.println("Dime tus 3 notas para calcularte la nota media global: Nota del examen, nota de practicas y nota de participacion.");
        Scanner sc = new Scanner(System.in);

        int notaDeExamen = sc.nextInt();
        int notaDePracticas = sc.nextInt();
        int notaDeParticipacion = sc.nextInt();
        double notaMedia = (notaDeExamen * 0.6) + (notaDePracticas * 0.3) + (notaDeParticipacion * 0.1);


        System.out.printf("Tu nota media es %.1f",  notaMedia);

    }

}
