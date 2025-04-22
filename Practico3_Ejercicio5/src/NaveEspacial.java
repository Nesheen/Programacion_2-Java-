public class NaveEspacial {
    private String nombre;
    public int combustible;

    public NaveEspacial(String nombre,int combustible){
        this.nombre=nombre;
        this.combustible=combustible;
    }

    public void despegar(){
        if(combustible<10){
            System.out.println("No se puede despegar con menos de 10 unidades");
        }else{
            combustible-=10;
        }
    }
    public void avanzar(int distancia){
        if(combustible>=distancia){
            System.out.println("Se avanzaron "+distancia+" unidadades");
        }else{
            System.out.println("Combustible insuficiente");
        }
    }
    public void recargarComubtible(int cantidad){
        if(cantidad<=100){
            combustible+=cantidad;
            System.out.println("Combustible recargado");
        }else{
            System.out.println("No se puede cargar dicha cantidad");
        }
    }

    public void mostrarEstado(){
        System.out.println("Nombre de la nave:"+nombre);
        System.out.println("Combustible disponible:"+combustible);
    }
}
