import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {

        //El programa genera un número aleatorio entre 1 y 100. El usuario lo intenta adivinar y se le
        //indica “mayor” o “menor” tras cada intento. Al acertar, muestra el número de intentos
        //empleados.
        //Adivina el número

        int secreto = (int) (Math.random() * 100) + 1;

        System.out.println("Introduce un numero aleatorio del 1 al 100: ");
        Scanner sc = new Scanner(System.in);

        int intento;
        int acumulacion = 0;

        do {
            intento = sc.nextInt();
            acumulacion++;
            if (intento > secreto) {
                System.out.println("Tu numero es mayor que el numero secreto. Sigue intentándolo! ");
            } else if (intento < secreto) {
                System.out.println("Tu numero es menor que el numero secreto. Sigue intentándolo! ");
            }

        }while (intento != secreto);
        System.out.println("Has acertado!! " + secreto + " Tras intentarlo " + acumulacion + " veces");

        }
        }

