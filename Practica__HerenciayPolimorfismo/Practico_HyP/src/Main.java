public class Main {
    public static void main(String[] args) {
        Empresa EMPR = new Empresa();

        EMPR.agregarEmpleado(new EmpleadoPorComision(6751,"Carlos","Alcaraz", 2005,5500));
        EMPR.agregarEmpleado(new EmpleadoPorComision(9514, "Marcos","Perez", 2024,110));

        EMPR.agregarEmpleado(new EmpleadoSalarioFijo(9871,"Tomas","Gil",2019));
        EMPR.agregarEmpleado(new EmpleadoSalarioFijo(1875,"Alejo","Previti",2016));
        EMPR.mostrarSalario();
        System.out.println("El empleado con mas clientes es: "+EMPR.empleadoConMasClientes().nombreCompleto());
    }
}