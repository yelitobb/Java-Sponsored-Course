import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConvertidorMonedas {
    public static void main(String[] args) {
        moneda m1 = new moneda("mlm","ñam");
        moneda m2 = new moneda("ml2","mlm");
        Scanner sc = new Scanner(System.in);
        LectorMoneda lm = new LectorMoneda("ñom");
        int repetidor = 1;

        List<String> listamonedas = new ArrayList<>();
        Collections.addAll(listamonedas,"GBP","YEN","USD","MXN","EUR","BRL","BOB","CAD","CUP","RUB");

        //monedas: gbp,yen,usd,mxn,euro,brasil(brl),bolivia(bob),canada(cad),cuba(cup),rusia(rub)
        while (repetidor == 1){
            System.out.println("-----Divisas-----");
            for (String cad:listamonedas){
                System.out.println(cad);
            }
            System.out.println("Elige una divisa: ");
            m1.setNombre(sc.nextLine());
            while (lm.Lector(m1.getNombre())!=1){
                System.out.println("No ingrese numeros o caracteres especiales");
                m1.setNombre(sc.nextLine());
            }
            while (listamonedas.contains(m1.getNombre().toUpperCase())!=true){
                System.out.println("Ingrese una divisa de la lista");
                m1.setNombre(sc.nextLine());
            }
            System.out.println("Ingresa una cantidad");
            m1.setCantidad(sc.nextLine());
            while (lm.esnumero(m1.getCantidad()) == false){
                System.out.println("Ingrese una cantidad sin letras o caracteres especiales");
                m1.setCantidad(sc.nextLine());
            }
            System.out.println("Elige la divisa a la que quieres pasar: ");
            m2.setNombre(sc.nextLine());
            while (listamonedas.contains(m2.getNombre().toUpperCase())!=true){
                System.out.println("Ingrese una divisa de la lista");
                m2.setNombre(sc.nextLine());
            }


            System.out.println(m1.getNombre());
            System.out.println(m1.getCantidad());
            System.out.println(m2.getNombre()
            );


            repetidor = 2;
        }

    }

}
