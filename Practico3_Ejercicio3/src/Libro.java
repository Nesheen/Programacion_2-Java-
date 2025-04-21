public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;

    public Libro(String titulo,String autor, int anioPublicacion) {
    this.titulo= titulo;
    this.autor=autor;
    this.anioPublicacion= anioPublicacion;
    }

    public void getTitulo(){
        System.out.println("Título:"+ titulo);
    }
    public void getAutor(){
        System.out.println("Autor:"+ autor);
    }
    public void getAnioPublicacion(){
        System.out.println("Año de publicación:"+ anioPublicacion);
    }
    public void setAnioPublicacion(int anioNuevo){
        if (anioNuevo >= 1900 && anioNuevo <= 2025) {
            anioPublicacion = anioNuevo;
            System.out.println("Año actualizado con éxito."+ anioNuevo);
        } else {
            System.out.println("Año inválido. Debe estar entre 1900 y 2025.");
        }

    }
}

