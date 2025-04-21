public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina){
        this.idGallina= idGallina;
        this.edad=0;
        this.huevosPuestos=0;
    }

    public void ponerHuevo(){
        huevosPuestos+=1;
    }
    public void envejecer(){
        edad+=1;
    }
    public void mostrarEstado(){
        System.out.println("Id Gallina:"+ idGallina);
        System.out.println("Edad de la gallina:"+edad);
        System.out.println("Huevos puestos:"+ huevosPuestos);
    }
}
