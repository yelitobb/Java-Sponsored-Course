public class Ciclos {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        short[] valores = {1,2,3,4,5,6,7,14,19};
        for (short valor: valores) {
            System.out.println(valor);
        }
        for (int i=0; i<= valores.length-1; i++){
            System.out.println(valores[i]);
        }
        short x = 0;
        while (x++<=10){
            System.out.println("W"+x);
        }
        boolean a = false;

        while (a){
            System.out.println("yey");
            //No se imprime este yey
        }

        do {
            System.out.println("yey");
        }while(false);

        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio"};
        String mesactual = "Marzo";


        for (String mess:meses) {
            if (mess == "Enero") {
                System.out.println(meses[1]);
            } else if (mess == "Febrero") {
                System.out.println(meses[2]);
            } else if (mess == "Marzo") {
                System.out.println(meses[3]);
            } else if (mess == "Abril") {
                System.out.println(meses[4]);
            } else if (mess == "Mayo") {
                System.out.println(meses[5]);
            } else if (mess == "Junio"){
                System.out.println(meses[6]);
            } else {
                System.out.println("Se acabo el año");
            }


        }

    }
}
