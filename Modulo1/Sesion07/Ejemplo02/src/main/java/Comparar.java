import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Comparar {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Arnulfo", "López",  1.65F);
        Persona persona2 = new Persona("José", "Saavedra",  1.71F);
        Persona persona3 = new Persona("Carolina", "Rivera",  1.51F);
        Persona persona4 = new Persona("Rubén", "González",  1.60F);
        Persona persona5 = new Persona("Julia", "Alvarez",  1.54F);

        //List<Persona> grupo = new ArrayList<>();
        List<Persona> grupo = new LinkedList<>();
        Collections.addAll(grupo,persona1,persona2,persona3,persona4,persona5);

        for (Persona p: grupo){
            System.out.println(p.getNombre()+" "+p.getApellido()+" mide: "+p.getEstatura());
        }
        System.out.println("------------");
        Collections.sort(grupo);
        for (Persona p: grupo){
            System.out.println(p.getNombre()+" "+p.getApellido()+" mide: "+p.getEstatura());
        }


    }
}
