package cuadernillo;
public class EjercicioCaso1Tema3 {
    public static void main(String[] args) {
        String[] calificaciones = {"muy deficiente", "deficiente", "aprobado", "bien", "notable", "sobresaliente"};
        String[] asignaturas = {"historia del arte", "pintura", "danza", "teatro"};
        double[][] notas = {
                {8, 6, 9},
                {8.25, 4.5, 9.25},
                {7.5, 6, 10},
                {7, 5, 6.25},

        };
        System.out.println(notas[3][2]);
        double [] medias = new double [4];
        for (int i= 0; i<notas.length;i++)
        {

        double suma = 0;
            for (int j= 0; j<notas[i].length;j++)
            {

                suma += notas[i][j];
            }
                medias[i] =suma/notas[i].length;
                System.out.println(asignaturas[i]+": "+medias[i]);
            }
        }
    }


