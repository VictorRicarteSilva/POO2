package ingredientes.leite;

import cafe.Cafe;
import ingredientes.IngredientesDecorator;

public class Leite extends IngredientesDecorator {
    public Leite(Cafe bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.0; // Custo do Leite
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }
}
