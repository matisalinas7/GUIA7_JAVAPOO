package Entidades;

public class Ahorcado {

    private String palabraBuscar[];
    private int encontradas;
    private int maxJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, int maxJugadas, int encontradas) {
        this.palabraBuscar = palabraBuscar;
        this.encontradas = encontradas;
        this.maxJugadas = maxJugadas;

    }

    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getMaxJugadas() {
        return maxJugadas;
    }

    public void setMaxJugadas(int maxJugadas) {
        this.maxJugadas = maxJugadas;
    }

}
