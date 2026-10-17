import java.util.Scanner;

public class EjercicioDescuento {


    public static void main(String[] args) {
        System.out.println("Dime el precio de la compra: ");
        //Ejercicio 1
        //• Hemos abierto una tienda y como promoción de bienvenida aplicaremos un 10% de
        //descuento a los clientes que realicen una compra igua l o superior a 100 €.
        //• Juego de prueba:
        //Entrada: 120 Salida: El precio final es de 108 €
        Scanner sc = new Scanner(System.in);

        int precioCompra = sc.nextInt();
        double precioFinal = precioCompra;
        if (precioCompra >= 100) {
            precioFinal = (precioCompra * 0.9);


        }

        System.out.println("El precio final es de " + (int) precioFinal + "Euros.");

    }

}
