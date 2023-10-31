public class Triangulo extends FiguraBase{
    private String estilo;
    public Triangulo(double base, double altura, String estilo){
        super(base,altura);
        this.estilo = estilo;
    }

    public double area(){
        return getAltura() * getBase() * 0.5;
    }

    public void mostrarEstilo(){
        System.out.println("El Triangulo es: "+ estilo);
    }
}
