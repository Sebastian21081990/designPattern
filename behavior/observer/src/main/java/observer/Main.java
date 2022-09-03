package observer;

import observer.model.Sucursal;
import observer.service.ProductService;

public class Main {

    public static void main(String[] args) {

        //Crea objeto notificadora
        ProductService productService = new ProductService();

        //Crea objetos subscriptores
        Sucursal sucursalEste = new Sucursal();
        sucursalEste.setNombre("Este");

        Sucursal sucursalNorte = new Sucursal();
        sucursalNorte.setNombre("Norte");

        //Añade los subscriptores al objeto notificador
        productService.agregar(sucursalNorte);
        productService.agregar(sucursalEste);

        //Cambia el estado del objeto notificadora
        productService.crearProducto("Cintas");

    }

}