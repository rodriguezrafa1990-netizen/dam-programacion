    package gimnasio;

    import java.util.Locale;
    import java.util.Scanner;

    public class PrecioConIva {
        static void main(String[] args) {
            System.out.println("Dime el precio de este producto sin IVA: ");
            Scanner sc = new Scanner(System.in);

            double precio = sc.nextDouble();
            final double IVA = 0.21;

            double conIva = (precio * (1 + IVA));
            double ivaDesglosado =  (double) Math.round((conIva - precio) *100) /100;


            System.out.println("El precio con IVA es: " + conIva + " Euros. De los cuales " + ivaDesglosado + " es el IVA.");
        }
    }
