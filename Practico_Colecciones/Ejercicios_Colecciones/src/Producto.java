public class Producto {
    private String id;
    private String nombre;
    private Double precio;
    private Integer cantidad;
    private CategoriaProducto categoria;

    public Producto(String id,String nombre,Double precio, Integer cantidad, CategoriaProducto categoria){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    public void mostrarInfo(){
        System.out.println("ID:"+ id +
                "\nNombre:"+ nombre +
                "\nPrecio: "+ precio +
                "\nCantidad: "+ cantidad+
                "\nCategoria: "+ categoria+ (categoria.getDescripcion()));

    }

    public String getId() {
        return id;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return ("Producto"+
                "\nID:"+ id+
                "\nNombre" + nombre +
                "\nPrecio:"+ precio +
                "\nCantidad"+ cantidad +
                "\nCategoria:" + categoria);
    }
}
