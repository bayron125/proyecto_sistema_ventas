package co.btrujillo.app.tienda.modelo.venta;

import co.btrujillo.app.tienda.modelo.Cajero;
import co.btrujillo.app.tienda.modelo.Cliente;
import co.btrujillo.app.tienda.modelo.inventario.Producto;
import co.btrujillo.app.tienda.repositorio.CrudRepositorioProductos;

import java.util.Date;

public class Venta  {
    private final CarritoDeCompras carrito;
    private CrudRepositorioProductos inventario;
    private final Cliente cliente;
    private final Date fecha;
    private final Cajero cajero;
    private final Integer numeroVenta;
    private static int ventaFinal=1;
    private double totalCobrar;

    public Venta(CarritoDeCompras carrito, CrudRepositorioProductos inventario, Cliente cliente, Cajero cajero){
      this.carrito = carrito;
      this.cliente= cliente;
      this.cajero = cajero;
      this.fecha = new Date();
      this.inventario = inventario;
      numeroVenta = ventaFinal++;
    }



    public void vender(){

            for(Producto p:carrito.listar()) {
                int cant= inventario.porId(p.getCodigo()).getCantidad();
                inventario.porId(p.getCodigo()).setCantidad(cant- p.getCantidad());
                totalCobrar += p.getPrecioVenta()*p.getCantidad();
            }
        }

    public void imprimir(){

        System.out.println
                ("----------------------------\n" +
                        "Numero de factura : " +
                this.numeroVenta+
                "\nFecha: " +
                this.fecha +
                "\nCliente : " +
                this.cliente.getNombre() +
                "\nCajero : " +
                this.cajero.getNombre() +
                "\n-----------------------\n" +
                carrito +"\n Total: " + this.totalCobrar);
    }


    public Integer getNumeroVenta() {
        return numeroVenta;
    }
}
