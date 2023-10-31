import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        Queue<String> cola = new PriorityQueue<>();
        cola.add("uno");
        cola.add("dos");
        cola.add("tres");
        cola.add("cuatro");
        cola.add("cinco");
        for (String cadena: cola){
            System.out.println("numero: "+cadena+"\n------------");
        }
        String valor = null;
        while ( (valor = cola.poll()) != null){
            System.out.println(valor);
        }
        System.out.println("--------------");

        Queue<Libro> libros = new PriorityQueue<>();
        libros.add(new Libro("uno",10));
        libros.add(new Libro("dos",8));
        libros.add(new Libro("tres",1));
        libros.add(new Libro("cuatro",4));
        libros.add(new Libro("cinco",9));
        libros.add(new Libro("seis",2));
        libros.add(new Libro("siete",6));
        libros.add(new Libro("ocho",3));
        libros.add(new Libro("nueve",5));
        libros.add(new Libro("diez",7));
        Libro l1 = null;
        while ( (l1 = libros.poll()) != null){
            System.out.println(l1.getTitulo());
        }
        System.out.println("----------");


    }
}
