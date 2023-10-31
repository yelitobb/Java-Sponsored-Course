import java.lang.reflect.Array;
import java.util.Arrays;

public class vehiculo {
    private llanta[] llanta = new llanta[4];
    private combustible combus = new combustible();


    public void setCombus(combustible combus){
        this.combus = combus;
    }

    public void colocaLlantas(llanta del_izq,llanta del_der,llanta tras_izq,llanta tras_der){
        llanta[0] = del_der;
        llanta[1] = del_izq;
        llanta[2] = tras_der;
        llanta[3] = tras_izq;
    }

    public void llenaTanque(){
        combus.setLitrosActuales(combus.getLitrosMax());
    }

    public void avanzar(){
        if (combus.getLitrosActuales()>0){
            for (llanta llantaac:llanta){
                llantaac.rueda();
            }
            combus.usa();
        }
        else {
            System.out.println("No hay combustible");
        }
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        vehiculo veh = (vehiculo) o;
        if(!Arrays.equals(llanta,veh.llanta)) return false;
        return combus.equals(veh.combus);
    }
    public static void main(String[] args) {
        llanta llanta1 = new llanta(205, 16, 35);
        llanta llanta2 = new llanta(205, 16, 35);
        llanta llanta3 = new llanta(205, 16, 35);
        llanta llanta4 = new llanta(205, 16, 35);

        combustible combustible1 = new combustible(40,0);


        vehiculo vehi = new vehiculo();
        vehi.setCombus(combustible1);
        vehi.colocaLlantas(llanta1, llanta2, llanta3, llanta4);
        vehi.llenaTanque();

        llanta llanta5 = new llanta(205, 16, 35);
        llanta llanta6 = new llanta(205, 16, 35);
        llanta llanta7 = new llanta(205, 16, 35);
        llanta llanta8 = new llanta(205, 16, 35);

        combustible combustible2 = new combustible( 40, 0);

        vehiculo vehiculo2 = new vehiculo();
        vehiculo2.setCombus(combustible2);
        vehiculo2.colocaLlantas(llanta5, llanta6, llanta7, llanta8);
        vehiculo2.llenaTanque();

        System.out.println(vehi.equals(vehiculo2));

        /*for (int i = 1; i <= 10; i++) {
            vehi.avanzar();
        }*/
    }
}
