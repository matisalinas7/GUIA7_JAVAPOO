/* 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20. */
package ej10_guia7;

import java.util.Arrays;

public class Ej10_Guia7 {

    public static void main(String[] args) {

        double A[] = new double[50];
        double B[] = new double[20];

        // Cargo array A con numeros aleatorios y lo muestro
        System.out.println(">>> Array A: ");

        for (int i = 0; i < 50; i++) {
            double num = Math.random() * 10;
            double numRound = Math.round(num * 100.0) / 100.0;
            A[i] = numRound;
            System.out.print("[" + A[i] + "]");
        }

        System.out.println("\n");

        // Ordeno array A de menor a mayor
        System.out.println(">>> Array A ordenado de menor a mayor: ");

        for (int i = 0; i < 50; i++) {
            Arrays.sort(A);
            System.out.print("[" + A[i] + "]");
        }

        System.out.println("\n");

        // Cargo array B con los pimeros 10 elementos ordenados del array A y los otros 10 con 0.5
        System.out.println(">>> Array B: ");

        for (int i = 0; i < 20; i++) {
            Arrays.fill(B, 0, 10, A[i]);
            Arrays.fill(B, 10, 20, 0.5);
            System.out.print("[" + B[i] + "]");
        }

        System.out.println("\n");

    }

}
