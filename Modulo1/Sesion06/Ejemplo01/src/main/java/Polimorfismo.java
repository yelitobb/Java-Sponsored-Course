public class Polimorfismo {
    public static void main(String[] args) {
        Venado v = new Venado();
        Animal a = v;
        Herviboro h = v;
        Object o = v;

        System.out.println("Venado: " + (v instanceof Venado));
        System.out.println("Animal: " + (v instanceof Animal));
        System.out.println("Hervivoro: " + (v instanceof Herviboro));
        System.out.println("Object: " + (v instanceof Object));
    }
}
