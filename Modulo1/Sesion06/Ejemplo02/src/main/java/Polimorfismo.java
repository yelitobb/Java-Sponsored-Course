import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Jose","Gomez","Biologia 62654-335");
        ProffesorInterno p2 = new ProffesorInterno("Hector","Gonzales","Arquitectura 2265-669", LocalDate.of(1996, Month.APRIL,16));

        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}
