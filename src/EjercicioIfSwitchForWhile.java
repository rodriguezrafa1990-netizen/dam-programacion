public class EjercicioIfSwitchForWhile {
    public static void main(String[] args) {
        // declaramos el int
        int numero = 4;
        // condicion if: si el numero es par ( se indica con %2 ==0) , luego abro llave, imprimo y cierro
        if (numero % 2 == 0) {
            System.out.println("Es un numero par");

            //Si no reune la condicion introduzco else y abro llave y cierro imprimiendo la otra opcion

        } else {
            System.out.println("Es un numero impar");
        }
// declaramos la opcion int
        int opcion = 3;
        // introducimos el switch entre parentesis el nombre del int, abrimos llave y declaramos las opciones dentro del switch con (case1,case2,...)


        switch (opcion) {
            // Indicamos los casos sin parentesis ni cierre, solo : y abajo el print. Al finalizar ;, y despues break;
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Otro dia");


        }

    }
}

