import java.time.LocalDateTime;
public class TicketSoporte {
    int id;
    private String descripcion;
    private String estado;
    private LocalDateTime fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnicoAsignado;

    //con usuario
    public TicketSoporte(int id,String descripcion,Usuario usuario){
        this.id = id;
        this.descripcion=descripcion;
        this.estado = "abierto";
        this.fechaCreacion= LocalDateTime.now();
        this.usuario=usuario;
    }
    //sin usuario
    public TicketSoporte(int id,String descripcion){
        this.id = id;
        this.descripcion=descripcion;
        this.estado = "abierto";
        this.fechaCreacion= LocalDateTime.now();
    }

    public void cerrarTicket(){
        estado = "cerrado";
    }
    public String mostrarDetalle(){
        return ("Ticket id: "+ id +
                "\nUsuario: "+ usuario +
                "\nDescripición: "+ descripcion +
                "\nEstado: "+ estado +
                "\nFecha de creación:"+ fechaCreacion +
                "\nTécnico asignado:"+ (tecnicoAsignado != null ? tecnicoAsignado : "No asignado"));
    }
    public void asignarTecnico(Tecnico tecnico){
        this.tecnicoAsignado = tecnico;
    }
    public int getId(){
        return id;
    }
    public String getEstado(){
        return estado;
    }
}