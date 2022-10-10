/* 1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir 
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y 
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además 
definir los métodos getters y setters correspondientes. */
package ejex1_guia7;

import Entidades.Cancion;
import Servicio.CancionServicio;

public class EjEx1_Guia7 {

    public static void main(String[] args) {

        CancionServicio cs = new CancionServicio();

        Cancion c1 = cs.cargarCancion();
        cs.mostrarCancion(c1);

    }

}
