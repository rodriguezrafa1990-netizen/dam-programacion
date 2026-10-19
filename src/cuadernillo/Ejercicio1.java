package cuadernillo;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
// Pedimos por pantalla al usuario que introduzca los numeros enteros
        System.out.print("Introduce 4 numeros enteros: ");
// Leemos el teclado del usuario y declaramos variables para: a,b,c,d
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
// Establecemos la operacion con las lecturas de la entrada del teclado del usuario
        int resultado = ((a + b) * (c % d));
// Imprimimos en pantalla el resultado de la operacion
        System.out.println(resultado);
        System.out.println("Has finalizado el primer ejercicio. \nBuen trabajo Rafa!! ");

    }

}
