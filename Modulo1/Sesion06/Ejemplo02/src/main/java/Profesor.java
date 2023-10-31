public class Profesor extends Persona{
    private String idProf;

    public Profesor(String nombre, String apellido,String idProf) {
        super(nombre, apellido);
        this.idProf = idProf;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Proffesor(id del Proffesor):"+idProf);

    }
}