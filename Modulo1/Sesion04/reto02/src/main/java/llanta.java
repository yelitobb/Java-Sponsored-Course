public class llanta {
    private float ancho;
    private float diametro;
    private float presion;

    public llanta(float ancho, float diametro, float presion) {
        this.ancho = ancho;
        this.diametro = diametro;
        this.presion = presion;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

    public void rueda(){
        System.out.println("Rodando............");
    }

    @Override
    public boolean equals(Object o){
        if(this == null) return true;
        if(o == null || getClass() != o.getClass()) return false;
        llanta llanta = (llanta) o;
        if (Float.compare(llanta.ancho, ancho) != 0) return false;
        if (Float.compare(llanta.diametro, diametro) != 0) return false;
        return Float.compare(llanta.presion, presion) == 0;

    }
}
