public class combustible {
    private int litrosMax;
    private int litrosActuales;

    public combustible(int litrosMax, int litrosActuales) {
        this.litrosMax = litrosMax;
        this.litrosActuales = litrosActuales;
    }

    public combustible() {
    }

    public int getLitrosMax() {
        return litrosMax;
    }

    public void setLitrosMax(int litrosMax) {
        this.litrosMax = litrosMax;
    }

    public int getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(int litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    public void usa(){
        litrosActuales--;
        System.out.println("Quedan: "+litrosActuales+" litros");
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        combustible that = (combustible) o;
        if(litrosMax != that.litrosMax) return false;
        return litrosActuales == that.litrosActuales;
    }
}
