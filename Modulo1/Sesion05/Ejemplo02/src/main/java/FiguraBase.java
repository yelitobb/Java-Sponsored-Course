public class FiguraBase {
    private double base;
    private double altura;
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }

    public FiguraBase(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    public void mostrarDimension(){
        System.out.println("La base es: "+ base + "---La altura es: "+ altura);
    }
}
