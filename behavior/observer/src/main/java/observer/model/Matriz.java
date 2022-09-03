package observer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import observer.enums.State;
import observer.service.ISubscriptora;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Matriz implements ISubscriptora {

    private String nombre;

    @Override
    public void actualizar(Product product, State state) {
        System.out.printf("Se %s el producto $s", state, product.getNombre());
    }

}
