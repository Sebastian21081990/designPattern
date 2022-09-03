package observer.service;

import observer.enums.State;
import observer.model.Product;

import java.math.BigDecimal;

public class ProductService extends NotificadoraAbstract{

    public void crearProducto(String nombre){

        int max = 100;
        int min = 1;
        double precio = Math.floor(Math.random()*(max-min+1)+min);
        Product product = new Product(nombre, BigDecimal.valueOf(precio));

        notificar(product, State.CREADO);

    }

    @Override
    void notificar(Product product, State state) {
        NotificadoraAbstract.subscriptorList.forEach(subscriptor -> subscriptor.actualizar(product, state));
    }

}
