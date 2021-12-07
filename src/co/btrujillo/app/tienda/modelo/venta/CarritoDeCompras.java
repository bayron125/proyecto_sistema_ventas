package co.btrujillo.app.tienda.modelo.venta;

import co.btrujillo.app.tienda.exception.ExcedeCantidadesException;
import co.btrujillo.app.tienda.modelo.inventario.Producto;
import co.btrujillo.app.tienda.repositorio.CrudRepositorioProductos;

public class CarritoDeCompras extends CrudRepositorioProductos{
    private final CrudRepositorioProductos inventario;

    public CarritoDeCompras(CrudRepositorioProductos inventario) {
        super();
        this.inventario = inventario;
    }

    public void agregarProducto (int codigoProducto, int cantidad) throws NullPointerException, ExcedeCantidadesException{
        if(inventario.porId(codigoProducto)==null ){
            throw new NullPointerException("El producto solicitado no se encuentra en inventario");
        }
        if(cantidad > inventario.porId(codigoProducto).getCantidad() ){
            throw  new ExcedeCantidadesException("Cantidad supera la disponible");
        }

        if(inventario.porId(codigoProducto) !=null && cantidad < inventario.porId(codigoProducto).getCantidad()){
            Producto productoAgregado= new Producto(inventario.porId(codigoProducto));
            productoAgregado.setCantidad(cantidad);
            this.crear(productoAgregado);

        }

    }

    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        for(Producto p: datasource){
           sb.append("\ncodigo: ")
                   .append(p.getCodigo())
                   .append("\t Producto: ")
                   .append(p.getNombre())
                   .append("\t Unidades: ")
                   .append(p.getCantidad())
                   .append("\t Precio Unitario: $")
                   .append(p.getPrecioVenta());

        }
        return sb.toString();
    }
}
