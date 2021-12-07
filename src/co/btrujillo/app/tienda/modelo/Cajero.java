package co.btrujillo.app.tienda.modelo;

public class Cajero extends Persona{
    private final Integer idEmpleado;

    public Cajero(String nombre, Integer identificacion, int idEmpleado) {
        super(nombre, identificacion);
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }
}
