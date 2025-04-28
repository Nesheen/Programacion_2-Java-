import java.time.LocalDateTime;

public class ticketSoporte {
    int id;
    private String descripcion;
    private String estado;
    private LocalDateTime fechaCreacion;

    public ticketSoporte(int id,String descripcion){
     this.id = id;
     this.descripcion=descripcion;
     this.estado = "abierto";
     this.fechaCreacion= LocalDateTime.now();
    }

    public void cerrarTicket(){
        estado = "cerrado";

    }
    public String mostrarDetalle(){
        return ("El ticket "+ id + ", con estado " + estado + ", fue creado el "+ fechaCreacion);
    }
}


