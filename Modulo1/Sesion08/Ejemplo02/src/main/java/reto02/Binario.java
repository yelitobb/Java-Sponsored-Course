package reto02;

import java.io.*;

public class Binario {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\yael_\\OneDrive\\Escritorio\\Universidad\\CursoBeduJava\\Modulo1\\Sesion08\\beto.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\yael_\\OneDrive\\Escritorio\\Universidad\\CursoBeduJava\\Modulo1\\Sesion08\\beto_copia.png"));
        byte[] buffer = new byte[1024];
        int bytesLeidos = 0;

        while ((bytesLeidos = bis.read(buffer)) > 0){
            bos.write(buffer, 0, bytesLeidos);
        }
        bos.close();
        bis.close();
    }
}
