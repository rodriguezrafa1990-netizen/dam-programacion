import java.util.Locale;
import java.util.Scanner;

public class SwitchSemana
{
    public static void main (String[] args) {


        /*
        Pide por teclado un número de 1 al 7 y muestra el día de la semana co rrespondiente. Si el
número no está entre 1 y 7, muestra "Día no válido".
• Modificación: En los días 6 y 7 tiene que mostrar el mensaje "Fin de semana"
         */
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.UK);

        System.out.println("Dime un numero del 1 al 7: ");
int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Dia no valido. ");
        }


}

}
