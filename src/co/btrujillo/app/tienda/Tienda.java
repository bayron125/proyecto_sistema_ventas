package co.btrujillo.app.tienda;

import co.btrujillo.app.tienda.exception.ExcedeCantidadesException;
import co.btrujillo.app.tienda.modelo.*;
import co.btrujillo.app.tienda.modelo.inventario.*;
import co.btrujillo.app.tienda.modelo.venta.*;
import co.btrujillo.app.tienda.repositorio.*;

public class Tienda {
    private final CrudRepositorioProductos inventario = new CrudRepositorioProductos();
    private final CrudRepositorioClientes clientes = new CrudRepositorioClientes();
    private final CrudRepositorioCajeros cajeros = new CrudRepositorioCajeros();
    private CarritoDeCompras carrito;
    private CrudRepositorioVentas ventas = new CrudRepositorioVentas();

    public void agregarFarmacia(String nombre,int codigo, double precioCompra, double precioVenta, String componentes, int cantidad) {
        inventario.crear(new Farmacia(nombre, codigo, precioCompra, precioVenta, componentes, cantidad));
    }

    public void agregarViveres(String nombre, int codigo, double precioCompra, double precioVenta, int peso, int cantidad) {
        inventario.crear(new Viveres(nombre, codigo, precioCompra, precioVenta, peso, cantidad));
    }

    public void agregarVarios(String nombre, int codigo, double precioCompra, double precioVenta, String detalles, int cantidad) {
        inventario.crear(new Varios(nombre,codigo, precioCompra, precioVenta, detalles, cantidad));
    }

    public void imprimirInventario(){
        System.out.println(this.inventario.listar());
    }

    public void contratarCajero(String nombre, int identificacion, int idEmpleado) {
        cajeros.crear(new Cajero(nombre, identificacion, idEmpleado));
    }

    public void desvincularEmpleado(int idEmpleado) {
        cajeros.eliminar(idEmpleado);
    }

    public void vincularCliente(String nombre, Integer identificacion) {
        clientes.crear(new Cliente(nombre, identificacion));
    }

    public void crearCarrito() {
        this.carrito = new CarritoDeCompras(inventario);
    }

    public Tienda agregarProductoCarrito(int codigo, int cantidad) throws ExcedeCantidadesException {
        carrito.agregarProducto(codigo, cantidad);
        return this;
    }

    public void generarVenta( int idCliente, int idCajero) {
        Venta venta = new Venta(this.carrito,this.inventario, clientes.porId(idCliente), cajeros.porId(idCajero));
        venta.vender();
        ventas.crear(venta);
        venta.imprimir();
        ventas.crear(venta);
    }

}
