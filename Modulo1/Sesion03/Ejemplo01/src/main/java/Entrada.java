import java.io.Console;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("hola "+nombre);

    }
}
