public class Letras {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Escribe el texto a analizar:");
        String texto = lector.leeEntrada();
        texto = texto.toLowerCase();
        Contador conteo = new Contador();

        int numVoc = conteo.cuentaVocales(texto);
        System.out.println("Numero de Vocales:" + numVoc);
        int numCons = conteo.cuentaConsonantes(texto);
        System.out.println("Numero de Consonantes:"+numCons);
        int numNum = conteo.cuentaNumeros(texto);
        System.out.println("Numero de numeros:"+numNum);
        int numSymbol = conteo.cuentaSimbolos(texto);
        System.out.println("Numero de Simbolos:"+numSymbol);

        lector.muestraMensaje("Hay "+ numVoc + " Vocales");
        lector.muestraMensaje("Hay "+ numNum + " Numeros");
        lector.muestraMensaje("Hay "+ numCons + " Consonantes");
        lector.muestraMensaje("Hay "+ numSymbol + " Simbolos");
    }


}
