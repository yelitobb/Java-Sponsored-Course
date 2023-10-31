public class vehiculo {
    private Llantas[] llanta = new Llantas[4];
    private Combustible combus = new Combustible();

    public void setCombus(Combustible combus){
        this.combus = combus;
    }

    public void colocaLlantas(Llantas del_izq,Llantas del_der,Llantas tras_izq,Llantas tras_der){
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
            for (Llantas llantaac:llanta){
                llantaac.rueda();
            }
            combus.usa();
        }
        else {
            System.out.println("No hay combustible");
        }
    }
    public static void main(String[] args) {
        Llantas llanta1 = new Llantas();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPresion(35);

        Llantas llanta2 = new Llantas();
        llanta2.setAncho(205);
        llanta2.setDiametro(16);
        llanta2.setPresion(35);

        Llantas llanta3 = new Llantas();
        llanta3.setAncho(205);
        llanta3.setDiametro(16);
        llanta3.setPresion(35);

        Llantas llanta4 = new Llantas();
        llanta4.setAncho(205);
        llanta4.setDiametro(16);
        llanta4.setPresion(35);

        Combustible combustible = new Combustible();
        combustible.setLitrosActuales((short) 0);
        combustible.setLitrosMax((short) 40);

        vehiculo vehi = new vehiculo();
        vehi.setCombus(combustible);
        vehi.colocaLlantas(llanta1, llanta2, llanta3, llanta4);
        vehi.llenaTanque();

        for (int i = 1; i <= 10; i++) {
            vehi.avanzar();
        }
    }
}
