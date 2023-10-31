public class Reto01 {
    public static void main(String[] args) {
        Bloques bloques = new Bloques();//esta linea es opcional ya que valor es una variable estatica y
                                        // podemos accesar sin necesidad de instanciarla
        Bloques.muestaValor();
    }
    /*public static class Bloques{
        private static final int VALOR;
        static{
            VALOR = 5;
        }
        public static void muestaValor() {
            System.out.println("valor: " + VALOR);
        }
    }*/
}

