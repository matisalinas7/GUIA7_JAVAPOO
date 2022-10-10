/* 12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior. */
package ej12_guia7;

import Entidades.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

public class Ej12_Guia7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PersonaServicio ps = new PersonaServicio();
        Persona p = ps.crearPersona();

        System.out.println("\n>>> La edad de " + p.getNombre() + " es " + ps.calcularEdad(p));

        System.out.print("\n- Ingrese una edad para calcular si es mayor a la persona ingresada: ");
        int edad = sc.nextInt();
        System.out.println(">>> " + ps.menorQue(p, edad));

        ps.mostrarPersona(p);

    }

}

/* public int calcularEdad(Persona p){
        Date fActual= new Date();
        // lo que hago es crear una fecha con el dia de nacimiento el mes de nacimiento y el año actual.
        Date fComp = new Date(fActual.getYear()-1900,p.getFechaNacimiento().getMonth()-1,p.getFechaNacimiento().getDay());
        //calulo la edad que deberia tener en el corriente año
        int edad = fActual.getYear()-p.getFechaNacimiento().getYear();

        if (fComp.after(fActual)) { //si la fecha compuesta es mayor a la actual quiere decir que aun no cumplio años
            return edad-1;          // este año. y resto 1.
        } else return edad;         //caso contrario ya cumplio años.
    }
*/