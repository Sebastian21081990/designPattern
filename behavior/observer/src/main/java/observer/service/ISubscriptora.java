package observer.service;

import observer.enums.State;
import observer.model.Product;

public interface ISubscriptora {
    void actualizar(Product product, State state);
}
