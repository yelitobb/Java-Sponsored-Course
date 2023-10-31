import java.time.LocalDate;

public class ProffesorInterno extends Profesor{
    private LocalDate fechaTerminacion;

    public ProffesorInterno(String nombre, String apellido, String idProf, LocalDate fechaTerminacion) {
        super(nombre, apellido, idProf);
        this.fechaTerminacion = fechaTerminacion;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Proffesor Interino(Fecha de Terminacion: "+ fechaTerminacion+")");
    }
}
