package Reto02;

import java.time.LocalDate;

public class DBA extends Empleado{
    private String herramientaConsultas;

    public DBA(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String herramientaConsultas) {
        super(nombre, edad, fechaNacimiento, salario);
        this.herramientaConsultas = herramientaConsultas;
    }

    public String getHerramientaConsultas(){
        return herramientaConsultas;
    }

    public void muestraHerramientas(){
        System.out.println("Las herramientas que usa son: "+herramientaConsultas);
    }

}
