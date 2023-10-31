package Reto02;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private byte edad;
    private final LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }



    public Persona(String nombre, byte edad, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void muestraAtributosPersona(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nFecha de Nacimiento"+fechaNacimiento);
    }

}
