package co.btrujillo.app.tienda.repositorio;

import co.btrujillo.app.tienda.modelo.Cliente;


public class CrudRepositorioClientes extends AbstractaListRepositorio <Cliente>{

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado=null;
        for(Cliente c: datasource){
            if(c !=null && c.getIdentificacion().equals(id)){
                resultado = c;
            }
        }
        return resultado;
    }

    @Override
    public void editar(Cliente elemento) {
        Cliente e = porId(elemento.getIdentificacion());
        e.setNombre(elemento.getNombre());
        e.setIdentificacion(elemento.getIdentificacion());
    }

    @Override
    public void eliminar(Integer id) {

    }
}
