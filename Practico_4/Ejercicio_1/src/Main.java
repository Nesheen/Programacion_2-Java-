public class Main {
    public static void main(String[] args) {

        ticketSoporte t1 = new ticketSoporte(1,"no me llega la transferencia");
        System.out.println(t1.mostrarDetalle());

        t1.cerrarTicket();
        System.out.println(t1.mostrarDetalle());

    }
}