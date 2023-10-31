package Reto02;

import java.time.LocalDate;

public class Programador extends Empleado{
    private String lenguajePrincipal;

    public String getLenguajePrincipal(){
        return lenguajePrincipal;
    }

    public Programador(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String lenguajePrincipal) {
        super(nombre, edad, fechaNacimiento, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public void muestraLenguaje(){
        System.out.println("El lenguaje que domina es: "+lenguajePrincipal);
    }

}
