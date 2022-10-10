/* 11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date(); */
package ej11_guia7;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ej11_Guia7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n- Ingrese el dia: ");
        int dia = sc.nextInt();
        System.out.print("- Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.print("- Ingrese el año: ");
        int anio = sc.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/Y");

        System.out.println("\n- Fecha ingresada: " + dateForm.format(fecha));
        System.out.println("- Fecha actual: " + dateForm.format(fechaActual));

        System.out.println("\n- Hay " + (fechaActual.getYear() - fecha.getYear()) + " años de diferencia entre la fecha actual y la ingresada.\n");

    }
}
