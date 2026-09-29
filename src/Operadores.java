public class Operadores {
    public static void main(String[] args) {
//Pedimos al ordenador que realice diferentes operaciones aritmeticas.
// En primer lugar declaramos los variables
        int a = 4;
        int b = 6;
        // Realizamos la suma
        int resultadoSuma = (a + b);
        // Realizamos la resta
        int resultadoResta = (a - b);
        // Realizamos la multiplicacion
        int resultadoMultiplicacion = (a * b);
        // Realizamos la division
        int resultadodivision = (a / b);
        // Realizamos el modulo
        int resultadoModulo = (a % b);

        // Imprimimos por consola todos los resoultados
        System.out.println(resultadoSuma);
        System.out.println(resultadoResta);
        System.out.println(resultadoMultiplicacion);
        System.out.println(resultadodivision);
        System.out.println(resultadoModulo);

// Ahora vemos operadores unarios

        //Incrementamos el valor de a en 1

        int e = ++a;
        // Imprimimos para comprobar que efectivamente ahora de 5 que era 4 + 1
        System.out.println(e);
        // Al haber modificado el valor de a, comprobamos que a tambien ha incrementado su valor en 1
        System.out.println(a);
// Disminuimos el valor de a en 1
        a = --a;
        //comprobamos por consola que vuelve a ser 4
        System.out.println(a);

        // ejemplo de negacion logica para booleans
        // Esto es true
        boolean f = true;
        // Con el ! delante declaramos no verdadero (falso)
        boolean g = !f;

        // comprobamos en pantalla
        //verdadero
        System.out.println(f);
        //falso
        System.out.println(g);
// Operadores de asignacion
        a = 10;
        // Vamos a mostrar cada valor de en cada cambio
        a += 5; // a ahora es 15
        System.out.println(a);
        a -= 3; // a ahora es 12
        System.out.println(a);
        a *= 2; // ahora es 24
        System.out.println(a);
        a /= 2; // ahora es 12
        System.out.println(a);
        a %= 5; // ahora es 2
        System.out.println(a);

        // Operadores relacionales
        a = 10;
        b = 5;

        boolean igual = (a == b);
        System.out.println(igual); // false
        boolean notIgual = (a != b);
        System.out.println(notIgual); // true
        boolean mayor = (a > b);
        System.out.println(mayor); // true
        boolean menor = (a < b);
        System.out.println(menor); // false
        boolean mayorIgual = (a >= b);
        System.out.println(mayorIgual); // true
        boolean menorIgual = (a <= b);
        System.out.println(menorIgual); // false
        // Operadores Logicos
        boolean bool1 = true;
        boolean bool2 = false;

        boolean resultado1 = bool1 && bool2; // (y) ambos tienen que ser true
        boolean resultado2 = bool1 || bool2; // (Or) uno de los 2  tienen que ser true
        boolean resultado3 = !bool1; // (no) invierte el valor


    }

}
