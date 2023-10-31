package Reto02;
import java.time.LocalDate;
import java.time.Month;

public class Reto02 {
    public static void main(String[] args) {
        Programador pro = new Programador("Ben", (byte)37, LocalDate.of(1982, Month.APRIL,4), 77435F, "Java");
        DBA dba = new DBA("Jack", (byte)28, LocalDate.of(1993, Month.JANUARY, 21), 45000F, "My SQL");

        System.out.println("DBA-------------------");
        dba.muestraAtributosPersona();
        dba.muestraSalario();
        dba.muestraHerramientas();

        System.out.println("Programador-------------------");
        pro.muestraAtributosPersona();
        pro.muestraSalario();
        pro.muestraLenguaje();
    }
}
