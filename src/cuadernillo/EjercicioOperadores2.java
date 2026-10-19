package cuadernillo;

import java.util.Scanner;

public class EjercicioOperadores2 {

//cuadernillo.Ejercicio2 Separa la parte entera de la decimal

    static void main(String[] args) {

        System.out.print("Introduce un número decimal: ");
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();

        int parteEntera = (int) numero;      // el casting de numero, como en el ejemplo del libro
        double parteDecimal = (numero - parteEntera);  // numero menos parteEntera

        System.out.println("Parte entera: " + parteEntera);
        System.out.printf("Parte decimal: %.2f%n", parteDecimal);
    }
}

