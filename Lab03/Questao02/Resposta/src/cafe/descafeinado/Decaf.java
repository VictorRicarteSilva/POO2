package cafe.descafeinado;

import cafe.Cafe;

public class Decaf extends Cafe {
    @Override
    public double calculaCusto() {
        return 2.5; // Custo base do Decaf
    }

    @Override
    public String getDescricao() {
        return "Decaf";
    }
}
