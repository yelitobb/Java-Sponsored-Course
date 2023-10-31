public class Contador {
    public boolean isVocal(char c){
        return (
                c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'
                );
    }
    public boolean isNumero(char c){
        short codigoascii = (short) c;
        return codigoascii >= 48 && codigoascii <= 57;
    }
    public boolean isConsonante(char c){
        short codigoascii = (short) c;
        return codigoascii >= 97 && codigoascii <= 122 && !isVocal(c);
    }
    public boolean isSimbolo(char c){
        return !(isVocal(c)||isConsonante(c)||isNumero(c));
    }
    public int cuentaVocales(String s){
        int cont = 0;
        for (char c:s.toCharArray()){
            if(isVocal(c)){
                cont++;
            }
        }
        return cont;
    }
    public int cuentaConsonantes(String s){
        int cont = 0;
        for (char c:s.toCharArray()){
            if (isConsonante(c)){
                cont++;
            }
        }
        return cont;
    }
    public int cuentaNumeros(String s){
        int cont = 0;
        for (char c:s.toCharArray()){
            if (isNumero(c)){
                cont++;
            }
        }
        return cont;
    }
    public int cuentaSimbolos(String s){
        int cont=0;
        for (char c:s.toCharArray()){
            if (isSimbolo(c)){
                cont++;
            }
        }
        return cont;
    }
}
