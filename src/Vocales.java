
import java.util.Scanner;
/*jercicio 4
• Murciélago es una de las pocas palabras que tienen todas las vocales. ¿Sabes alguna más?
• La entrada es una sola palabra, escrita solo en letras minúsculas del alfabeto inglés. Sin
acentos.
• El programa escribirá “TODAS” si durante la frase han aparecido todas las vocales, y
“FALTAN” si falta alguna vocal.
Entrada: murcielago Salida: TODAS
canalla FALTAN*/

public class Vocales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = scan.nextLine();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int h = 0;
        for (int g = 0; g < palabra.length(); g++) {
            if (palabra.charAt(g) == 'a') {
                a++;
            } else if (palabra.charAt(g) == 'e') {
                e++;
            } else if (palabra.charAt(g) == 'i') {
                i++;
            } else if (palabra.charAt(g) == 'o') {
                o++;
            } else if (palabra.charAt(g) == 'u') {
                u++;
            }
        }
            if (a>0 && e>0 && i>0 && o>0 && u>0) {
                System.out.println("TODAS");
                    }
            else {System.out.println("FALTAN");

            }

        }
    }
