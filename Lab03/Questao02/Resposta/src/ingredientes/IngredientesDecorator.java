package ingredientes;

import cafe.Cafe;

public abstract class IngredientesDecorator extends Cafe {
    protected Cafe bebida;

    public IngredientesDecorator(Cafe bebida) {
        this.bebida = bebida;
    }
}
