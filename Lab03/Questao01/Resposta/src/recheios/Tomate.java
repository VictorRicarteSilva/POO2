package recheios;

import pizza.Massa;

public class Tomate extends RecheioDecorator{
    private final Massa tipo;
    public Tomate(Massa tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo.getNome() + ", Tomate";
    }
    public double getValor() {
        return this.tipo.getValor() + 1.0;
    }
}