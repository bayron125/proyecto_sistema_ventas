package co.btrujillo.app.tienda.modelo.inventario;

public class Producto {

    protected String nombre;
    protected double precioCompra;
    protected double precioVenta;
    protected int cantidad;
    private  Integer codigo;
    private int cantidadesVariadas =0;

    public Producto() {
    }

    public Producto(String nombre, Integer codigo, double precioCompra, double precioVenta, int cantidad ){
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public Producto(Producto p) {
        this.nombre = p.getNombre();
        this.precioCompra = p.getPrecioCompra();
        this.codigo = p.getCodigo();
        this.precioVenta=p.getPrecioVenta();
        this.cantidad = p.getCantidad();

    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Integer getCodigo() {
        return codigo;
    }


    public void setCantidadVariable(int variador) {
        this.cantidadesVariadas =variador;
    }

    public int getCantidadesVariadas() {
        return cantidadesVariadas;
    }

    public void setPrecios(double precioCompra, double precioVenta){
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void disminuirCantidades(){
        this.cantidad=this.cantidad-this.cantidadesVariadas;
    }

    @Override
    public String toString() {
        return
                "\n Id: "+ this.codigo + "\n producto: " + nombre +
                "\n Tipo: " + this.getClass().getSimpleName()+
                "\n precio de Compra: " + precioCompra +
                "\n precio de Venta: " + precioVenta +
                "\n unidades disponibles: " + cantidad;

    }
}
