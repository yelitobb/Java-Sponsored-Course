import java.io.*;

public class Texto {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/archivo.txt"));
        bw.write("Esta es una línea de texto que irá en el archivo");
        bw.newLine();
        bw.write("Esta es una segunda línea de texto que también irá en el archivo\n");
        bw.write("Esta será la última línea del archivo de texto.");

        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(	System.getProperty("user.home") + "/archivo.txt"));
        String linea = null;

        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
    }
}
