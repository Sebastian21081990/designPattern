package observer.service;

import observer.enums.State;
import observer.model.Product;
import java.util.ArrayList;
import java.util.List;

public abstract class NotificadoraAbstract {

    public static final List<ISubscriptora> subscriptorList;

    static {
        subscriptorList = new ArrayList<>();
    }

    public void agregar(ISubscriptora subscriptor){
        subscriptorList.add(subscriptor);
    }

    public void eliminar(ISubscriptora subscriptor){
        subscriptorList.remove(subscriptor);
    }

    abstract void notificar(Product product, State state);

}
