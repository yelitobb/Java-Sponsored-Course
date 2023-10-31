package Reto02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Arnulfo", "López",  1.65F);
        Persona persona2 = new Persona("José", "Saavedra",  1.71F);
        Persona persona3 = new Persona("Carolina", "Rivera",  1.51F);
        Persona persona4 = new Persona("Rubén", "González",  1.60F);
        Persona persona5 = new Persona("Julia", "Alvarez",  1.54F);
        Persona persona6 = new Persona("Alejandro", "López", 1.68F);

        List<Persona> grupo = new ArrayList<>();
        Collections.addAll(grupo,persona1,persona2,persona3,persona4,persona5,persona6);
        for (Persona p: grupo){
            System.out.println(p.getNombre()+" "+p.getApellido()+" mide: "+p.getEstatura());
        }
        System.out.println("------------");

        //podemos usar diferentes comparadores para ordenar de distintas maneras
        //aqui usaremos 2 ComparadorPersonas y ComparadorInverso
        Collections.sort(grupo,new ComaparadorPersonas());
        for (Persona p: grupo){
            System.out.println(p.getNombre()+" "+p.getApellido()+" mide: "+p.getEstatura());
        }

        System.out.println("---------------\n orden alfabetico inverso");
        Collections.sort(grupo,new ComparadorInverso());
        for (Persona p: grupo){
            System.out.println(p.getNombre()+" "+p.getApellido()+" mide: "+p.getEstatura());
        }
    }
}
