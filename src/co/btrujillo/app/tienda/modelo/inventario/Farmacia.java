package co.btrujillo.app.tienda.modelo.inventario;

public class Farmacia extends Producto {

    private final String componentes;

    public Farmacia(String nombre,int codigo, double precioCompra, double precioVenta, String componentes, int cantidad) {
        super(nombre,codigo, precioCompra, precioVenta, cantidad);
        this.componentes = componentes;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n componentes: " + this.componentes;
    }
}
