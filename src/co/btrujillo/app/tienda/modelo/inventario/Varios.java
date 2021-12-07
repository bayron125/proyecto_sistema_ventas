package co.btrujillo.app.tienda.modelo.inventario;


public class Varios extends Producto {
    private final String detalles;

    public Varios(String nombre,int codigo, double precioCompra, double precioVenta, String detalles,int cantidad ){
        super(nombre,codigo, precioCompra, precioVenta,cantidad);
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return super.toString() + "\n descripcion: " + this.detalles;
    }
}
