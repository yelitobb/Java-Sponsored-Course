package Reto01;

public class Telefono implements Comparable<Telefono>{
    @Override
    public int compareTo(Telefono telefono){
        return this.prioridad - telefono.prioridad;
    }
    private final String numero;
    private final int prioridad;

    public Telefono(String numero, int prioridad) {
        this.numero = numero;
        this.prioridad = prioridad;
    }

    public String getNumero() {
        return numero;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
