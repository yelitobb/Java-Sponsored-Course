public abstract class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarDatos(){
        System.out.println("Persona (nombre: "+nombre+",apellidos: "+apellido+").");
    }
}
