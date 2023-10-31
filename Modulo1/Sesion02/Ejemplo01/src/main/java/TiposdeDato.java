public class TiposdeDato {
    public static void main(String[] args) {
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1L;

        float valorFloat = 1.5F;
        double valorDouble = 1.5;

        boolean valorBool = true;
        char valorChar = 'B';

        int numF = (int)valorFloat;

        int num = valorInt + numF;

        System.out.println(num);

        int num_char = (int) valorChar;
        System.out.println(num_char);

        char car2 = (char) num_char;
        System.out.println(car2);

        valorInt++;
        valorInt++;
        valorInt--;
        System.out.println("ValorInt vale:"+ valorInt);
        valorChar = 'B';
        valorChar++;
        System.out.println("ValorChar vale:"+valorChar);
    }
}
