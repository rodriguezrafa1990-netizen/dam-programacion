package cuadernillo;

public class EjercicioMultiplos3ySuma {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 3; i <= 30; i += 3) {
            System.out.println(i);
            suma += i;
        }

        System.out.println(suma);
    }
}