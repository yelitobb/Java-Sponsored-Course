public class Combustible {
    private short litrosMax;
    private short litrosActuales;

    public short getLitrosMax() {
        return litrosMax;
    }

    public void setLitrosMax(short litrosMax) {
        this.litrosMax = litrosMax;
    }

    public short getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    public void usa(){
        litrosActuales--;
        System.out.println("Quedan: "+litrosActuales+" litros");
    }
}
