package Reto01;

import java.io.File;

public class Reto01 {
    public static void main(String[] args) {
        File directorioInicial = new File("C:\\Users\\yael_\\OneDrive\\Escritorio\\Universidad\\CursoBeduJava\\Modulo1\\Sesion08\\temp");

        muestraContenidoDirectorio(directorioInicial);

    }
    private static void colocaEspacios(String directorioPadre, char simbolo){
        System.out.print("[" + simbolo + "]");

        for (int i = 0; i < directorioPadre.length(); i++) {
            System.out.print("-");
        }
    }
    private static void muestraContenidoDirectorio(File directorio) {
        colocaEspacios(directorio.getParent(), 'D');
        System.out.println(directorio.getName());
        File[] subdirectorios = directorio.listFiles();
        for (File archivo : subdirectorios) {
            if (archivo.isFile()) {
                colocaEspacios(archivo.getParent(), 'A');
                System.out.println(archivo.getName());

            } else if (archivo.isDirectory()) {
                muestraContenidoDirectorio(archivo);
            }
        }
    }



}

