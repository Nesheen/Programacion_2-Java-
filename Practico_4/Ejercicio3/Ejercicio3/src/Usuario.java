public class Usuario {
    private int id;
    private String nombre;
    private String email;

    public Usuario(String nombre, int id, String email){
        this.nombre = nombre;
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return ("Nombre:" + nombre + ", id:"+ id + ", email:"+email);
    }
}