package reto03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frutas {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Platanos");
        frutas.add("Sandia");
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Naranja");
        frutas.add("Kiwi");
        //Collections.addAll(frutas, "Plátanos", "Sandía", "Pera", "Manzana", "Naranja", "Kiwi");

        Collections.reverse(frutas);
        muestraFrutas(frutas);
        System.out.println("La fruta mas pequeña es: "+Collections.min(frutas));
        System.out.println("La fruta mas grande es: "+Collections.max(frutas));
        System.out.println("----------*----------*-------");
        Collections.sort(frutas);
        muestraFrutas(frutas);

        int a = Collections.binarySearch(frutas,"Manzana");
        int b = Collections.binarySearch(frutas,"Pera");
        System.out.println("La Manzana esta en la posicion: "+ a);
        System.out.println("La pera esta en la posicion: "+ b);
        System.out.println("----------*--------*----------");
        Collections.addAll(frutas,"Manzana","Manzana","Manzana");
        muestraFrutas(frutas);
        System.out.println("---------****------*****");
        Collections.shuffle(frutas);
        muestraFrutas(frutas);
        int f = Collections.frequency(frutas,"Manzana");
        System.out.println("Hay "+f+" manzanas en la lista");
    }
    private static void muestraFrutas(List<String> lista) {
        for (String fruta : lista) {
            System.out.println(fruta);
        }
    }
}
