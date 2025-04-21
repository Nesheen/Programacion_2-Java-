public class Estudiantes {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiantes(String nombre, String apellido, String curso, double calificacion){
        this.nombre= nombre;
        this.apellido= apellido;
        this.curso=curso;
        this.calificacion=calificacion;
    }
    public void mostrarInfo(){
        System.out.println("Nombre:"+ nombre);
        System.out.println("Apellido:"+ apellido);
        System.out.println("Curso:"+ curso);
        System.out.println("Calificacion:"+ calificacion);
    }
    public void subirCalificacion(double puntos){
        if (puntos <= 10 && puntos >=1){
            puntos = puntos;
            System.out.println("La nota actual es de:"+ puntos);
        }else
            System.out.println("Nota invalida");
    }

    public void bajarCalificacion(double puntos){
        if (puntos <= 10 && puntos >=1){
            puntos = puntos;
            System.out.println("La nota actual es de:" + puntos);
        }else
            System.out.println("Nota invalida");
    }
}

