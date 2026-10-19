package gimnasio;

import java.util.Locale;
import java.util.Scanner;

public class CelsiusaFahrenheit {
    static void main(String[] args) {
        System.out.println("Dime la temperatura en grados Celsius: ");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.UK);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5 + 32);

        System.out.println("Los grados en Fahrenheit son " + fahrenheit + " grados Fahrenheit");

    }
}
