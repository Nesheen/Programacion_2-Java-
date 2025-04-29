public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto p1 = new Producto("A01", "Leche", 3.5, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("B02", "Celular", 999.99, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("C03", "Remera", 15.0, 25, CategoriaProducto.ROPA);
        Producto p4 = new Producto("D04", "Lavarropas", 20.0, 30, CategoriaProducto.HOGAR);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);

        System.out.println("Todos los productos:");
        inventario.listarProductos();


        System.out.println("\nCategorias:");
        inventario.mostrarCategoriasDisponibles();


        System.out.println("\nCategoría ropa:");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ROPA)) {
            p.mostrarInfo();
        }
        System.out.println("\nProductos entre 10 y 30:");
        for (Producto p : inventario.filtrarProductosPorPrecio(10, 30)) {
            p.mostrarInfo();
        }
        System.out.println("\nProductos con mas stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }
        System.out.println("\nTotal de stock:");
        System.out.println("Total: " + inventario.obtenerTotalStock());
    }
}
