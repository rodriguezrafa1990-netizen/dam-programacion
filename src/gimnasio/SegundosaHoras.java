package gimnasio;

import java.util.Scanner;

public class SegundosaHoras {
    public static void main(String[] Args) {
        System.out.println("Dime un numero de segundos: ");
        Scanner sc = new Scanner(System.in);

        int segundos = sc.nextInt();
        int horas = (segundos / 3600);
        int resto = (segundos % 3600);
        int minutos = (resto / 60);
        int segs = (resto % 60);
        System.out.println(horas + " h " + minutos + " min " + segs + " segundos.");

    }


}


