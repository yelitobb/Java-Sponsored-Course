import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("uno");
        listaCadenas.add("dos");
        listaCadenas.add("tres");
        listaCadenas.add("tres");
        listaCadenas.add("cuatro");
        listaCadenas.add("cinco");

        for (int i = 0; i<listaCadenas.size();i++){
            System.out.println(listaCadenas.get(i));
        }

        for (String cadena:listaCadenas){
            System.out.println(cadena);
        }

        Set<String> setCadenas = new HashSet<>();
        setCadenas.add("uno");
        setCadenas.add("dos");
        setCadenas.add("tres");
        setCadenas.add("tres");
        setCadenas.add("four");
        setCadenas.add("tres");
        setCadenas.add("five");

        for (String cadena:setCadenas){
            System.out.println(cadena);
        }
        System.out.println("---------------");
        List<Numero> listanumeros = new ArrayList<>();
        listanumeros.add(new Numero("uno"));
        listanumeros.add(new Numero("dos"));
        listanumeros.add(new Numero("tres"));
        listanumeros.add(new Numero("tres"));
        listanumeros.add(new Numero("cuatro"));
        listanumeros.add(new Numero("cinco"));

        for (Numero numero:listanumeros){
            System.out.println(numero.getNombre());
        }
        System.out.println("****************");

        Set<Numero> setNumeros =new HashSet<>();
        setNumeros.add(new Numero("uno"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("cuatro"));
        setNumeros.add(new Numero("cinco"));
        for (Numero numero:setNumeros){
            System.out.println(numero.getNombre());
        }

    }
}
