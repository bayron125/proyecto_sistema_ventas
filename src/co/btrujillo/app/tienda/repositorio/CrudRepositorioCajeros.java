package co.btrujillo.app.tienda.repositorio;

import co.btrujillo.app.tienda.modelo.Cajero;

public class CrudRepositorioCajeros extends AbstractaListRepositorio<Cajero>{
    @Override
    public Cajero porId(Integer id) {
        Cajero resultado=null;
        for(Cajero c: datasource){
            if(c !=null && c.getIdEmpleado().equals(id)){
                resultado = c;
            }
        }
        return resultado;
    }

    @Override
    public void editar(Cajero elemento) {

    }

    @Override
    public void eliminar(Integer id) {
        datasource.remove(porId(id));
    }
}
