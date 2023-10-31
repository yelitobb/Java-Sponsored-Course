public class Sobrecarga {
    public static void main(String[] args) {
        Equipo eq1 = new Equipo("Gladiadores","Valencia",8);
        Equipo eq2 = new Equipo("CDMX");
        System.out.println("El equipo " + eq2.getNombre() + " de " + eq2.getCiudad() + " tiene " + eq2.getPuntos() + " puntos.");

        eq2.actualiza(10);
        eq2.actualiza("Vencedores");

        System.out.println("El equipo " + eq2.getNombre() + " de " + eq2.getCiudad() + " tiene " + eq2.getPuntos() + " puntos.");


    }
}
