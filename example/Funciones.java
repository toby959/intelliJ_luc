package example;

import java.util.Scanner;

public class Funciones {


    public static void main(String[] args) {

    /*    int[] numeros = new int[5];

        cargarNumeros(numeros);
        mostrarNumeros(numeros);
    }

    private static void cargarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {  // i < 5  numeros magicos
            int numero = pedirNumeroAlUsuario();
            numeros[i] = numero;

        }
    }

    private static void mostrarNumeros(int[] numeros) {
        System.out.println("Estos son los números que cargaste");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);

        }
    }
            private static int pedirNumeroAlUsuario () {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese un numero");
                int numero = teclado.nextInt();
                return numero;


        System.out.println("################################################");

        float sumatoria = 0;

        sumatoria += getAreaRectangulo(10, 15);
        sumatoria += getAreaRectangulo(20, 30);
        System.out.println("Sumatoria total: " + sumatoria);
    }
   //cambiamos void * float
private static float getAreaRectangulo(float ancho, float alto){
    //Estatico
         //float ancho = 10;
         // float alto = 15;

        //float area = ancho * alto;
       // System.out.println(area);
        //return area;
//Mejora codigo
        return ancho * alto;
*/
        System.out.println("####################################################");

        String nuevoPassword = generarPassword();
        System.out.println(nuevoPassword);

    }
        private static String generarPassword () {
            double aleatorio = Math.random() * 10000;
            long numeroAleatorio = Math.round(aleatorio);
            String password = "dsdsds" + numeroAleatorio;
            return password;


    }
}


