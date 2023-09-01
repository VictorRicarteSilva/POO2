package recheios;

import pizza.Massa;

public class Queijo extends RecheioDecorator{
    private final Massa tipo;
    public Queijo(Massa tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo.getNome() + ", Queijo";
    }
    public double getValor() {
        return this.tipo.getValor() + 3.0;
    }
}
