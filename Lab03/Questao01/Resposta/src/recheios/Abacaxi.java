package recheios;

import pizza.Massa;

public class Abacaxi extends RecheioDecorator{
    private final Massa tipo;
    public Abacaxi(Massa tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo.getNome() + ", Abacaxi";
    }
    public double getValor() {
        return this.tipo.getValor() + 2.0;
    }
}
