import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10]; //Declarar arreglo con 10 espacios
        int conteo_pares = 0, conteo_impares = 0;

        System.out.println("Llenando el arreglo: ");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = entrada.nextInt();

            if (arreglo[i] % 2 == 0) { //verificar si los datos del arreglo son pares
                conteo_pares++; //aumenta de 1 en 1 conteo

            } else {
                conteo_impares++;
            }
        }

        int[] par = new int[conteo_pares]; //crear arreglo de pares
        int[] impar = new int[conteo_impares]; //crear arreglo de impares

        conteo_pares = 0; //reseteamos a 0
        conteo_impares = 0;

        for (int i = 0; i < 10; i++) { //llenamos los arreglos con sus datos nuevos
            if (arreglo[i] % 2 == 0) { //aumentamos los datos de los  arreglos
                par[conteo_pares] = arreglo[i]; //Guardamos los pares
                conteo_pares++;
            } else {
                impar[conteo_impares] = arreglo[i];
                conteo_impares++;
            }
        }
            System.out.println("El arreglo par es: ");
            for (int i = 0; i < conteo_pares; i++) { //Mostramos los datos del arreglo
                System.out.println(par[i] + " - ");
            }
            System.out.println(" ");

            System.out.println("El arreglo impar es: ");
            for (int i = 0; i < conteo_impares; i++) {
                System.out.println(impar[i] + " - ");
            }


        }
    }