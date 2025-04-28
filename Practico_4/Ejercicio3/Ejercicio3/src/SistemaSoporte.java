import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private static int contadorTickets = 0;
    private List<TicketSoporte> tickets;

    //---------------------------------------------------------------
    public SistemaSoporte(){
        tickets = new ArrayList<>();}
    //---------------------------------------------------------------
    public TicketSoporte crearTicket(String descripcion, Usuario usuario){
        contadorTickets ++;
        TicketSoporte nuevoTicket = new TicketSoporte(contadorTickets,descripcion,usuario);
        tickets.add(nuevoTicket);
        return nuevoTicket;}

    //-------------------------------------------------------------------

    public void asignarTecnico(Tecnico tecnico, int idTicket){
        for (TicketSoporte ticket : tickets){
            if (ticket.getId() == idTicket){
                ticket.asignarTecnico(tecnico);
                return;
            }
        }
        System.out.println("Ticket no encontrado");
    }

    //-----------------------------------------------------------------

    public void listarTicketsAbiertos(){
        System.out.println("Tickets abiertos");
        for (TicketSoporte ticket : tickets){
            if (ticket.getEstado().equalsIgnoreCase("abierto")){
                System.out.println(ticket.mostrarDetalle());
            }
        }
    }
    //-----------------------------------------------------------------

    public void listarTicketsCerrados(){
        System.out.println("Tickets cerrados");
        for(TicketSoporte ticket : tickets){
            if(ticket.getEstado().equalsIgnoreCase("cerrado")){
                System.out.println(ticket.mostrarDetalle());
            }
        }
    }

    public static int getContadorTickets() {
        return contadorTickets;
    }
}
