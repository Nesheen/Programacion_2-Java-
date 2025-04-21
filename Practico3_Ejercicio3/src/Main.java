public class Main {
    public static void main(String[] args) {

        Libro libro1= new Libro("Gato Con Botas","Pedro Sanchez",2000);

        libro1.getTitulo();
        System.out.println();

        libro1.getAutor();
        System.out.println();

        libro1.getAnioPublicacion();
        System.out.println();

        libro1.setAnioPublicacion(2008);
    }
}