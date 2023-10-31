package Reto02;

public class Persona implements Comparable<Persona>{
    @Override
    public int compareTo(Persona persona){
        return 0;
    }

    private final String nombre;
    private final String apellido;
    private float estatura;

    public Persona(String nombre, String apellido, float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    public String getApellido(){
        return apellido;
    }
}
