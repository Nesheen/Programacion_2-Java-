public class Main {
    public static void main(String[] args) {

        NaveEspacial nave00= new NaveEspacial("Soul1",50);

        nave00.avanzar(60);

        nave00.recargarComubtible(40);
        nave00.avanzar(60);

        nave00.mostrarEstado();


    }
}