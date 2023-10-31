public class Persona implements Comparable<Persona>{
    @Override
    public int compareTo(Persona persona){
        //hay varias formas de comparar aqui tenemos 2, una la creamos por nosotros y la otro la de la clase Float
        //si queremos que la estatura sea de ascendente a descendente lo unico que hacemos es o cambiar 1 por -1
        //o el orden de comparar dentro del metodo Float.compare
        if (this.estatura>persona.estatura){
            return 1;
        } else if (this.estatura< persona.estatura) {
            return -1;
        }else {
            return 0;
        }
        //return Float.compare(this.estatura,persona.estatura);
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
