package observer.model;

import lombok.*;
import observer.enums.State;
import observer.service.ISubscriptora;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Sucursal implements ISubscriptora {

    private String nombre;
    private List<Product> productList;

    public Sucursal(){
        this.productList = new ArrayList<>();
    }

    @Override
    public void actualizar(Product product, State state) {
        System.out.printf("Se %s el producto %s en la sucursal %s%n", state, product.getNombre(), nombre);

        if(state.equals(State.CREADO)){
            productList.add(product);
        }

    }

}
