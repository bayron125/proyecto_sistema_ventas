package co.btrujillo.app.tienda.modelo;

public abstract class Persona {
    protected String nombre;
    protected Integer identificacion;

    public Persona(String nombre, Integer identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }
}
