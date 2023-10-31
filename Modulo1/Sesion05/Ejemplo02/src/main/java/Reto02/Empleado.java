package Reto02;

import java.time.LocalDate;

public class Empleado extends Persona{
    private float salario;

    public float getSalario(){
        return salario;
    }
    public Empleado(String nombre, byte edad, LocalDate fechaNacimiento, float salario){
        super(nombre,edad,fechaNacimiento);
        this.salario = salario;
    }

    public void muestraSalario(){
        System.out.println("El salario es: "+salario);
    }

}
