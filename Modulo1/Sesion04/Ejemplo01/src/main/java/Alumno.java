public class Alumno {
    private String curso;
    private String objetivo;
    private byte sesion;

    {
        curso = "Java Standard Edition 2020";
    }
    {
        System.out.println("Bloque de Inic");
        curso = "Java Standard Edition";
        sesion = 4;
        objetivo = "Dominar Java";
    }

    public Alumno() {
        this.curso = null;
        this.sesion = 0;
        this.objetivo = null;
    }

    public Alumno(String curso, String objetivo, byte sesion) {
        this.curso = curso;
        this.objetivo = objetivo;
        this.sesion = sesion;
    }

    public String getCurso() {
        return curso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public byte getSesion() {
        return sesion;
    }
}
