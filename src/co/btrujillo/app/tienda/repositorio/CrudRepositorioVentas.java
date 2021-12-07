package co.btrujillo.app.tienda.repositorio;


import co.btrujillo.app.tienda.modelo.venta.Venta;

public class CrudRepositorioVentas extends AbstractaListRepositorio<Venta> {


    @Override
    public Venta porId(Integer id) {
        Venta resultado= null;
        for(Venta v: datasource){

            if(v != null &&  v.getNumeroVenta().equals(id) ){
                resultado = v;
            }
        }
        return resultado ;
    }

    @Override
    public void editar(Venta elemento) {
    }

    @Override
    public void eliminar(Integer id) {
        datasource.remove(porId(id));
    }
}

