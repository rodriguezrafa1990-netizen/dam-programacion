import java.util.Scanner;
import java.util.Locale;


public class Monedas {


    public static void main(String[] args) {
/*Dada una cantidad de euros, descompón la cantidad en monedas de 2 €, 1 €, 0.5 €, 0.2 €, 0.1 €,
0.05 €, 0.02 € y 0.01 €.
• Juego de prueba:
Entrada: 13.81 € Salida: Monedas de 2 € = 6
Monedas de 1 € = 1
Monedas de 0.5 € = 1
Monedas de 0.2 € = 1
Monedas de 0.1 € = 1
Monedas de 0.05 € = 0
Monedas de 0.02 € = 0
Monedas de 0.01 € = 1*/

        System.out.println("Cuanto dinero tienes? ");
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.UK);
        double total = scan.nextDouble();
        int centimos = (int) Math.round(total * 100);
        int deMonedaDe2 = 0;
        while (centimos >= 200) {
            centimos = centimos - 200;
            deMonedaDe2++;


        }
        System.out.println("Tienes " + deMonedaDe2 + " monedas de dos euros.");
        int deMonedaDe1 = 0;
        while (centimos >= 100) {
            centimos = centimos - 100;
            deMonedaDe1++;
            System.out.println("Tienes " + deMonedaDe1 + " monedas de un euro.");
        }

        int deMonedaDe05 = 0;
        while (centimos >= 50) {
            centimos = centimos - 50;
            deMonedaDe05++;
        }
        System.out.println("Tienes " + deMonedaDe05 + " monedas de cincuenta centimos");

        int deMonedaDe02 = 0;
        while (centimos >= 20) {
            centimos = centimos - 20;
            deMonedaDe02++;
        }
        System.out.println("Tienes " + deMonedaDe02 + " monedas de veinte centimos");

        int deMonedaDe01 = 0;
        while (centimos >= 10) {
            centimos = centimos - 10;
            deMonedaDe01++;
        }
        System.out.println("Tienes " + deMonedaDe01 + " monedas de diez centimos");

        int deMonedaDe005 = 0;
        while (centimos >= 5) {
            centimos = centimos - 5;
            deMonedaDe005++;
        }
        System.out.println("Tienes " + deMonedaDe005 + " monedas de cinco centimos");

        int deMonedaDe002 = 0;
        while (centimos >= 2) {
            centimos = centimos - 2;
            deMonedaDe002++;
        }
        System.out.println("Tienes " + deMonedaDe002 + " monedas de 2 centimos");

        int deMonedaDe001 = 0;
        while (centimos >= 1) {
            centimos = centimos - 1;
            deMonedaDe001++;
        }
        System.out.println("Tienes " + deMonedaDe001 + " monedas de 1 centimos");


    }
}

