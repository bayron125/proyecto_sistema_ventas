package co.btrujillo.app.tienda.repositorio;

import java.util.HashSet;
import java.util.List;

public interface CrudRepositorio <T> {
    List<T> listar();
    T  porId (Integer id );
    void crear(T elemento);
    void editar(T elemento);
    void eliminar(Integer id);

}
