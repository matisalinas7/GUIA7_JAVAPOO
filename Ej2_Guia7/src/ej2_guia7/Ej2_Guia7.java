/* 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = Pi * radio^2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * Pi * radio). */
package ej2_guia7;

import Entidades.Circunferencia;
import Servicio.CircunferenciaServicio;

public class Ej2_Guia7 {

    public static void main(String[] args) {

        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia c1 = cs.crearCircunferencia();
        cs.area(c1);
        cs.perimetro(c1);

    }

}
