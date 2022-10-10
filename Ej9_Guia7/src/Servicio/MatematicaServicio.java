package Servicio;

import Entidades.Matematica;

public class MatematicaServicio {

    public double devolverMayor(Matematica m) {

        return Math.max(m.getN1(), m.getN2());

    }

    public void calcularPotencia(Matematica m) {

        double mayor = Math.max(m.getN1(), m.getN2());
        double menor = Math.min(m.getN1(), m.getN2());

        long roundMayor = Math.round(mayor);
        long roundMenor = Math.round(menor);

        System.out.println(">>> Potencia " + roundMayor + "^" + roundMenor + " = " + (int) Math.pow(roundMayor, roundMenor));

    }

    public void calcularRaiz(Matematica m) {

        double min = Math.min(m.getN1(), m.getN2());
        double absMin = Math.abs(min);

        System.out.println(">>> Raiz √" + absMin + " = " + Math.sqrt(absMin) + "\n");

    }

}
