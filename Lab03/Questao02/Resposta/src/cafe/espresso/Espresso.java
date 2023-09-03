package cafe.espresso;

import cafe.Cafe;

public class Espresso extends Cafe {
    @Override
    public double calculaCusto() {
        return 2.0; // Custo base do Espresso
    }

    @Override
    public String getDescricao() {
        return "Espresso";
    }
}
