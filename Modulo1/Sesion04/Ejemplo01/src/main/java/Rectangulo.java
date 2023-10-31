public class Rectangulo {
    private double alto;
    private double ancho;

    public Rectangulo() {
        this(0);
    }
    public Rectangulo(double lados){
        this(lados,lados);
    }
    public Rectangulo(double ancho,double alto){
        this.alto = alto;
        this.ancho = ancho;
    }
    private void Area(){
        System.out.println("El área es: "+ alto*ancho);
    }
    private double CalcArea(){
        return ancho*alto;
    }

    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();
        Rectangulo rec2 = new Rectangulo(2);
        Rectangulo rec3 = new Rectangulo(2,3);
        rec1.Area();
        rec2.Area();
        rec3.Area();
        System.out.println("Area rectangulo 1:"+rec1.CalcArea());
        System.out.println("Area rectangulo 2:"+rec2.CalcArea());
        System.out.println("Area rectangulo 3:"+rec3.CalcArea());
    }


}
