public class Main {
    public static void main(String[] args) {
        // creo el sistema
        SistemaSoporte sistema = new SistemaSoporte();

        // creo el user
        Usuario juan = new Usuario("Juan Lorenzo", 101, "juan.lorenzo@email.com");

        // creo ticket Juan
        TicketSoporte ticketDeJuan = sistema.crearTicket("No puedo acceder a mi cuenta", juan);

        // creo al tecninco
        Tecnico pedro = new Tecnico(700, "pedro Sanchez", "Soporte de cuentas");

        // asigno el ticket al tecnico
        sistema.asignarTecnico(pedro,ticketDeJuan.getId());

        // cierro el ticket
        ticketDeJuan.cerrarTicket();

        // muestro que tickes estan abiertos
        sistema.listarTicketsAbiertos();

        // muestro que tickets estan cerrados
        sistema.listarTicketsCerrados();

    }
}