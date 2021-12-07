package co.btrujillo.app.tienda.repositorio;
import co.btrujillo.app.tienda.modelo.inventario.Producto;

public class CrudRepositorioProductos extends AbstractaListRepositorio<Producto> {




    @Override
    public Producto porId(Integer id) {
        Producto resultado = null;
        for(Producto pro: this.datasource){
            if(pro.getCodigo() != null && pro.getCodigo().equals(id)){
                resultado = pro;
            }
        }
        return resultado;
    }

    @Override
    public void editar(Producto elemento) {
       Producto e = porId(elemento.getCodigo());
       e.setNombre(elemento.getNombre());
       e.setPrecios(elemento.getPrecioCompra(),elemento.getPrecioVenta());
       e.setCantidad(elemento.getCantidad());
    }

    @Override
    public void eliminar(Integer id) {
        this.datasource.remove(this.porId(id));
    }

}
