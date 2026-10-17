import java.util.Scanner;

public class EjercicioSueldo {

    public static void main(String[] args) {
        //  Ejercicio 1
        //•
        //Marcos quiere comprarse un ordenador nuevo. Haz un programa que pida el precio delPCy el sueldo mensual de Marcos. Se tiene que calcular cuántos días tiene que ahorrar para poder comprarlo.
        //•
        //Juego de prueba:
        //Entrada: 1345 900Salida: Marcos tiene que ahorrar durante 45 días
        //Ordenador nuevo

        Scanner sc = new Scanner(System.in);
        System.out.println("Que precio tiene el pc que quieres comprar? ");
        int precioPc = sc.nextInt();
        System.out.println("Que sueldo mensual tiene Marcos? ");
        int sueldoMarcos = sc.nextInt();
        int DiasTrabajados = 30;
        double  sueldoDiario = (sueldoMarcos / DiasTrabajados);
        double diasExactos = (int) precioPc / sueldoDiario;
        int diasAhorro = (int) Math.ceil(diasExactos);

        System.out.println("Marcos tiene que ahorrar: " + diasAhorro + "dias.");

    }
}

