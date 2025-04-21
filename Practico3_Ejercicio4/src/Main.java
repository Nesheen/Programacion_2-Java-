public class Main {
    public static void main(String[] args) {

        Gallina gallina1= new Gallina("H222");
        Gallina gallina2= new Gallina("V777");

        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();

        gallina1.envejecer();
        gallina1.envejecer();
        gallina2.envejecer();

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();


    }
}