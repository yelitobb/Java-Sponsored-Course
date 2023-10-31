import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LectorMoneda {
    private String texto;

    public LectorMoneda(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public static boolean contieneNumeros(String cadena) {
        return cadena.matches(".*\\d.*");
    }

    public static boolean contieneCaracteresEspeciales(String cadena) {
        Pattern pattern = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]+-¿¡=\'_");
        Matcher matcher = pattern.matcher(cadena);
        return matcher.find();
    }
    public boolean esnumero(String cadena){
        try {
            float numeroFloat = Float.parseFloat(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public int Lector(String moneda){
        String textoaleer = moneda.toLowerCase();
        // Verificar si la cadena contiene números
        boolean contieneNum = contieneNumeros(textoaleer);
        if (contieneNum) {
            return 0;
            //return "No ingrese numeros";
        }

        // Verificar si la cadena contiene caracteres especiales
        boolean contieneEsp = contieneCaracteresEspeciales(textoaleer);
        if (contieneEsp) {
            return 0;
            //return "No ingrese caracteres especiales";
        }

        //monedas: gbp,yen,usd,mxn,euro,brasil(brl),bolivia(bob),canada(cad),cuba(cup),rusia(rub)
        return 1;

    }



}
