import java.util.Scanner;

//Ejercicio1
public class EjerciciosOperadores {
    public static void main(String[] args) {
        System.out.print("Introduce 2 numeros enteros: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int division = (a / b);
        int resto = (a % b);
        double divisionDecimales = (double) a / b;
        System.out.println("Division: " + division);
        System.out.println("Resto: " + resto);
        System.out.printf("Division con decimales: %.2f%n ", divisionDecimales);

        //Ejercicio2

        System.out.print("Introduce un número decimal: ");
        double numero = sc.nextDouble();

        int parteEntera = (int) numero;      // el casting de numero, como en el ejemplo del libro
        double parteDecimal = (numero - parteEntera);  // numero menos parteEntera

        System.out.println("Parte entera: " + parteEntera);
        System.out.printf("Parte decimal: %.2f%n", parteDecimal);
    }
}




