import java.util.ArrayList;
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    //---------------------------------------
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    //-----------------------------------------
    public void listarProductos() {
        for (Producto producto : this.productos) {
            producto.mostrarInfo();
        }
    }

    //-------------------------------------------
    public Producto buscarProductoPorId(String id) {
        int i = 0;
        Producto productoEncontrado = null;
        while (i < productos.size() && !this.productos.get(i).getId().equals(id)) {
            i++;
        }
        if (i < productos.size()) {
            productoEncontrado = this.productos.get(i);
        }
        return productoEncontrado;
    }

    //--------------------------------------------------------------
    public Producto eliminarProducto(String id) {
        Producto prodEliminar = buscarProductoPorId(id);
        if (prodEliminar != null) {
            this.productos.remove(prodEliminar);
        }
        return prodEliminar;
    }

    //_--------------------------------------------------------------
    public Producto ActualizarStock(String id, int nuevaCantidad) {
        Producto prodActualizar = buscarProductoPorId(id);
        if (prodActualizar != null) {
            prodActualizar.setCantidad(nuevaCantidad);
        }
        return prodActualizar;
    }

    public int obtenerTotalStock(){
        int total =0;
        for (Producto producto :productos){
            total += producto.getCantidad();
        }
        return total;
    }
    public Producto obtenerProductoConMayorStock(){
        if(productos.isEmpty())return null;
        Producto mayor = productos.get(0);
        for(Producto p : productos){
            if(p.getCantidad() > mayor.getCantidad()){
                mayor = p;
            }
        }
        return mayor;
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getCategoria() == categoria) {
                filtrados.add(producto);
            }
        }
        return filtrados;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                filtrados.add(producto);
            }
        }
        return filtrados;
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria.name() + ": " + categoria.getDescripcion());
        }
    }


    //-------------------------------------------------------------------
    public ArrayList<Producto> filtarPorCategoria(String categoria) {
        ArrayList<Producto> productos = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getCategoria().name().equals(categoria)) {
                productos.add(producto);
            }
        }
        return productos;
    }
}
