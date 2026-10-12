import java.util.Scanner;

public class EjercicioOperadores3 {

/* Ejercicio3 Mayor y multiplo
Lee dos enteros con Scanner y muestra:
El mayor de los dos, usando el operador ternario.
true o false según si el primer número es múltiplo del segundo, con % y ==. Pista: si es múltiplo, la división es exacta y no sobra nada.
Pruebas:
Con 10 y 5, tiene que salir mayor 10 y true.
Con 7 y 3, tiene que salir mayor 7 y false.
No uses 0 como segundo número, porque dividir entre cero da error.
El esqueleto con los dos huecos para rellenar lo tienes en mi mensaje anterior. Una clase propia, Ejercicio3.


 */


   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos numeros enteros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mayor = (a>b) ?  a:b;

boolean multiplo = a%b == 0;
String respuesta = multiplo ? "si" : "no";
       System.out.println("Mayor: "+ mayor);
       System.out.println(a + " Es multiplo de " + b + "?: "+ respuesta);


    }
}

