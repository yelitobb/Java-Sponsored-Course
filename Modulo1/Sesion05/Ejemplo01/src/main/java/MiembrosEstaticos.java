public class MiembrosEstaticos {
    public static void main(String[] args) {
        Contador cont1 = new Contador();
        Contador cont2 = new Contador();
        Contador cont3 = new Contador();
        Contador cont4 = new Contador();

        System.out.println("cont1.contadorInstancia: " + cont1.getContadorInstancia());
        System.out.println("cont1.contadorClase: " + Contador.getContadorClase());
        System.out.println("\ncont4.contadorInstancia: " + cont4.getContadorInstancia());
        System.out.println("cont4.contadorClase: " + Contador.getContadorClase());

    }

}
