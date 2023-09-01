package recheios;

import pizza.Massa;

public abstract class RecheioDecorator extends Massa {
    protected Boolean vegano;
    protected Boolean vegetariano;
    protected Boolean carne;

    public Boolean getVegetariano() {
        return vegetariano;
    }

    public Boolean getVegano() {
        return vegano;
    }

    public Boolean getCarne() {
        return carne;
    }
}
