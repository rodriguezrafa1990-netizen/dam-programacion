package gimnasio;
import java.util.Scanner;
public class DiasMes {

    public static void main(String[] args) {
        System.out.println("Escribe un dia del mes: ");
        Scanner teclado = new Scanner(System.in);
   int mes = teclado.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 días");
                break;
            case 2:
                System.out.println("28 días");
                break;
            default:
                System.out.println("Mes no válido");
        }
        }

    }


