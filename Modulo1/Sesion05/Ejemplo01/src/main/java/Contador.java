public class Contador {
    private static short contadorClase;
    private short contadorInstancia;

    public Contador(){
        contadorClase++;
        contadorInstancia++;
    }

    public Contador(short contadorInstancia) {
        this.contadorInstancia = contadorInstancia;
    }

    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }
}
