package Entidades;

public class Nif {

    private long numDNI;
    private String letra;

    public Nif() {
    }

    public Nif(long numDNI, String letra) {
        this.numDNI = numDNI;
        this.letra = letra;
    }

    public long getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(long numDNI) {
        this.numDNI = numDNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

}
