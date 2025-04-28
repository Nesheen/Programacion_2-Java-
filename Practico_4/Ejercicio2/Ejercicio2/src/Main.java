public class Main {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("Epicteto",784,"epici@ashe.com");
        TicketSoporte t1 = new TicketSoporte(2,"falla en el riel",user1);

        System.out.println(t1.mostrarDetalle());

        System.out.println("----------------");
        t1.asignarTecnico("Marcos Aurelio");
        System.out.println(t1.mostrarDetalle());

    }
}