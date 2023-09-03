package ingredientes.chocolate;

import cafe.Cafe;
import ingredientes.IngredientesDecorator;

public class Chocolate extends IngredientesDecorator {
    public Chocolate(Cafe bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.5; // Custo do Chocolate
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chocolate";
    }
}
