public class automovil {
    private String marca;
    private String modelo;
    private int a_fab;
    private int kilometraje;

    public automovil(String marca, String modelo, int a_fab, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.a_fab = a_fab;
        this.kilometraje = kilometraje;
    }

    @Override
    public int hashCode(){
        int hash =0;
        hash = marca.hashCode();
        hash = hash + modelo.hashCode();
        hash = hash + a_fab;
        hash = hash + kilometraje;
        return hash;
    }

    public static void main(String[] args) {
        automovil auto1 = new automovil("Ford","Shelby",1965,25000);
        automovil auto2 = new automovil("Bugati","Veyron Blue Centenaire",2009,10000);
        automovil auto3 = new automovil("Ferrai","335 Spider Scaglietti",1957,12000);
        System.out.println("Auto 1 hash:"+auto1.hashCode()+"\nAuto 2 hash:"+auto2.hashCode()+"\nAuto 3 hash:"+auto3.hashCode());
    }
}
