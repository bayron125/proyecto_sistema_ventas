package co.btrujillo.app.tienda.modelo;

public class Cliente extends Persona {

    private long puntos;

    private static int idfinal;

    public Cliente(String nombre, Integer identificacion) {
        super(nombre, identificacion);
    }

    public long getPuntos() {
        return puntos;
    }


}
