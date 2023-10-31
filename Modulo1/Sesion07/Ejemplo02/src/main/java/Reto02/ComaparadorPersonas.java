package Reto02;

import java.util.Comparator;

public class ComaparadorPersonas implements Comparator<Persona> {
    @Override
    public int compare(Persona p1,Persona p2){
        String nc1 = p1.getNombre()+p1.getApellido();
        String nc2 = p2.getNombre()+p2.getApellido();
        return nc1.compareTo(nc2);
    }
}
