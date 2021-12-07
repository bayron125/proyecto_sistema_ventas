package co.btrujillo.app.tienda.modelo.inventario;

public class Viveres extends Producto {

    private final int peso;


    public Viveres(String nombre, int codigo, double precioCompra, double precioVenta, int peso, int cantidad) {
        super(nombre, codigo, precioCompra, precioVenta, cantidad);
        this.peso = peso;
    }



    public float getPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return super.toString()  + " \n Peso: " + this.peso + " g";
    }


}
