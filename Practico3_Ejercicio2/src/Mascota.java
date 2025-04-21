public class Mascota {
    String nombre;
    String especie;
    double edad;

    public Mascota(String nombre,String especie, double edad){
        this.nombre= nombre;
        this.especie=especie;
        this.edad=edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre:"+ nombre);
        System.out.println("Especie:"+ especie);
        System.out.println("Edad:"+ edad);
    }

    public void cumplirAnios(){
        edad+=1;
        System.out.println("Edad:"+edad);
    }
}
