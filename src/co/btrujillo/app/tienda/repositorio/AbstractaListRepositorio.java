package co.btrujillo.app.tienda.repositorio;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T> implements CrudRepositorio<T>{

    protected List<T> datasource;

    public AbstractaListRepositorio(){
        datasource = new  ArrayList<T>();
    }

    public AbstractaListRepositorio(List<T> lista){
        datasource =lista;
    }

    @Override
    public  List<T> listar() {
        return datasource;
    }


    @Override
    public void crear(T t) {
        datasource.add(t);

    }


}
