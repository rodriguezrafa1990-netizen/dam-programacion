    import java.util.Scanner;

    public class ProgramaNotaMedia {
        public static void main(String[] args) {
            System.out.print("Dime tus dos notas: ");

            Scanner sc = new Scanner(System.in);
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double media = (nota1 + nota2) / 2;

            if (media >= 5) {
                System.out.printf("Tu nota media es %.2f. Has aprobado%n", media);
            } else {
                System.out.printf("Tu nota media es %.2f%n", media + ". Has Suspendido");
            }


        }

    }
