package ingredientes.canela;

import cafe.Cafe;
import ingredientes.IngredientesDecorator;

public class Canela extends IngredientesDecorator {
    public Canela(Cafe bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.5; // Custo da Canela
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Canela";
    }
}
