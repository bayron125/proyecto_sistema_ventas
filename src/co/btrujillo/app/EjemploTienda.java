package co.btrujillo.app;

import co.btrujillo.app.tienda.Tienda;
import co.btrujillo.app.tienda.exception.ExcedeCantidadesException;

public class EjemploTienda {
    public static void main(String[] args) throws ExcedeCantidadesException {
        Tienda miTienda= new Tienda();

        miTienda.contratarCajero("Yhuver Quintero", 1010232464,1);
        miTienda.contratarCajero("Gilibert Moreno", 12465907, 2);

        miTienda.vincularCliente("Dairis Camacho", 39756123);
        miTienda.vincularCliente("Marco Tulio",98124654);

        miTienda.agregarFarmacia("Paracetamol",10234,2000,4000,"muchos quimicos",50);
        miTienda.agregarFarmacia("Ribotril ",2352,25000,52000," clonazepam (DCI)", 50);
        miTienda.agregarViveres("arroz",1243,1500,3000,1000,40);
        miTienda.agregarViveres("cocholate", 5421, 4500,6000,500,40);
        miTienda.agregarVarios("perfume",8954, 3000,56000,"pachuli",200);
        miTienda.agregarVarios("Cuaderno", 9457,1000,3000,"Norma cuadriculado", 69);
        miTienda.agregarVarios("Portavaso", 2394, 500,8000,"parece original",45);
        miTienda.imprimirInventario();

        miTienda.crearCarrito();
        miTienda.agregarProductoCarrito(2394, 4)
                .agregarProductoCarrito(2352,9)
                .agregarProductoCarrito(5421,12);

        miTienda.generarVenta(98124654,1);

        miTienda.imprimirInventario();



    }
}
