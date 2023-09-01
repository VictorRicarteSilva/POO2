package recheios;

import pizza.Massa;

public class Calabresa extends RecheioDecorator{
    private final Massa tipo;
    public Calabresa(Massa tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo.getNome() + ", Calabresa";
    }
    public double getValor() {
        return this.tipo.getValor() + 5.0;
    }
}
