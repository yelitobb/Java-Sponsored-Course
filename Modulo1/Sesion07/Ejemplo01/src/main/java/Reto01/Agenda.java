package Reto01;

import java.util.*;

public class Agenda {
    public static void main(String[] args) {
        Map<String,String> agenda = new TreeMap<>();
        agenda.put("Carlos", "5824-6397");
        agenda.put("Beto", "6185-7961");
        agenda.put("Abigail", "6848-6573");
        agenda.put("César", "7418-5296");
        agenda.put("Mónica", " 7698-1254");
        agenda.put("Fernando", "9753-8642");

        for(String nombre : agenda.keySet()){
            System.out.println(nombre+": "+agenda.get(nombre));
        }

        System.out.println("-----------------");

        Map<String, Queue<Telefono>> agenda2 = new TreeMap<>();
        agenda2.put("Carlos", new PriorityQueue<Telefono>());
        agenda2.put("Beto", new PriorityQueue <Telefono>());
        agenda2.put("Abigail", new PriorityQueue <Telefono>());
        agenda2.put("César", new PriorityQueue <Telefono>());
        agenda2.put("Mónica", new PriorityQueue <Telefono>());
        agenda2.put("Fernando", new PriorityQueue <Telefono>());

        Collections.addAll(agenda2.get("Carlos"), new Telefono("5824-6397", 1), new Telefono("8271-9346", 2));
        Collections.addAll(agenda2.get("Beto"), new Telefono("6185-7961", 1));
        Collections.addAll(agenda2.get("Abigail"), new Telefono("6848-6573", 1), new Telefono("4152-6378", 2));
        Collections.addAll(agenda2.get("César"), new Telefono("7418-5296", 1));
        Collections.addAll(agenda2.get("Mónica"), new Telefono("7698-1254", 1), new Telefono("1973-4682", 2));
        Collections.addAll(agenda2.get("Fernando"), new Telefono("9753-8642", 1));

        for (String nombre : agenda.keySet()){
            System.out.println("nombre: "+nombre);
            Queue<Telefono> telefonos = agenda2.get(nombre);
            Telefono tel = null;

            while ((tel = telefonos.poll()) != null){
                System.out.println("\t" + tel.getNumero() + "\n");
            }
        }
    }
}
