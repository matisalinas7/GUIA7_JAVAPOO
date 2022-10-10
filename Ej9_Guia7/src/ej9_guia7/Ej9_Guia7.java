/* 9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. */
package ej9_guia7;

import Entidades.Matematica;
import Servicio.MatematicaServicio;

public class Ej9_Guia7 {

    public static void main(String[] args) {

        Matematica m = new Matematica();

        m.setN1(Math.random() * 10);
        m.setN2(Math.random() * 10);

        System.out.println("\nNumero 1: " + m.getN1() + "\nNumero 2: " + m.getN2());

        MatematicaServicio ms = new MatematicaServicio();

        System.out.println("\n>>> El numero de mayor valor es: " + ms.devolverMayor(m));
        ms.calcularPotencia(m);
        ms.calcularRaiz(m);

    }

}
