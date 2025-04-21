public class Main {
    public static void main(String[]args){

        Estudiantes estudiante1 = new Estudiantes("Neyén","Bianchi","Matmática",5);

        estudiante1.mostrarInfo();
        System.out.println();

        estudiante1.subirCalificacion(10);
        System.out.println();

        estudiante1.bajarCalificacion(8);
    }
}