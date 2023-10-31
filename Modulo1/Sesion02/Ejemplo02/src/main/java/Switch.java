public class Switch {
    public static void main(String[] args) {
        boolean b = true;
        if (b){
            System.out.println("b es verdadero");
        }
        else{
            System.out.println("b es falso");
        }

        String mensaje;
        byte calif = 9;

        switch(calif){
            case 10:
                System.out.println("Excelente");
                break;
            case 9:
            case 8:
                System.out.println("muy bien");
                break;
            case 7:
                System.out.println("Bien hecho");
                break;
            case 6:
                System.out.println("Pasaste");
                break;
            default:
                System.out.println("vuelve a intentarlo");
        }
        String mes = "Enero";
        switch (mes){
            case "Enero" :
                System.out.println("Febrero");
            case "Febrero" :
                System.out.println("Marzo");
            case "Marzo" :
                System.out.println("Abril");
            case "Abril" :
                System.out.println("Mayo");
            case "Mayo" :
                System.out.println("Junio");
            case "Junio" :
                System.out.println("Julio");
            case "Julio" :
                System.out.println("Agosto");
            case "Agosto" :
                System.out.println("Septiembre");
            case "Septiembre" :
                System.out.println("Octubre");
            case "Octubre" :
                System.out.println("Noviembre");
            case "Noviembre" :
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Se acabo el año");
        }

    }
}
