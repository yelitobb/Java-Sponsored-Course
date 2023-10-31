package Reto02;

public class reto2 {
    public static void main(String[] args) {
        Figura fig = null;
        fig = new Triangulo();
        fig.formulaCalcularArea();



        fig = new Cuadrado();
        fig.formulaCalcularArea();

        fig = new Rectangulo();
        fig.formulaCalcularArea();
    }
}
