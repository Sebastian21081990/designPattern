package observer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum State {

    CREADO("Creado"),
    ACTUALIZADO("Actualizado"),
    ELIMINADO("Eliminado");

    private final String nombre;

}
