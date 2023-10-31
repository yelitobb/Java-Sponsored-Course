public class Herencia {
    public static void main(String[] args) {
        Triangulo trian1 = new Triangulo(4.0,4.0,"Estilo 1");
        System.out.println("Informacion para Triangulo 1:");
        trian1.mostrarEstilo();
        trian1.mostrarDimension();
        System.out.println("El area es: "+trian1.area());
    }
}
