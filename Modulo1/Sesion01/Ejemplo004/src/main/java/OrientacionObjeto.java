public class OrientacionObjeto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNombre("Marianne");
        autor.setApellido("mendez");
        autor.setEdad(56);

        Libro libro = new Libro();
        libro.setAutor(autor);
        libro.setNumpag(500);
        libro.setTitulo("Persepolis");

        System.out.println("Libro:"+ libro.getTitulo());
        System.out.println("Autor:"+ autor.getNombre()+" "+ autor.getApellido());
    }
}
