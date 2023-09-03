import pizza.*;
import recheios.*;
public class Pizzaria {
    public static void main(String[] args) {
        Massa massaEspressa = new MassaEspressa();
        Massa massaFina = new MassaFina();
        RecheioDecorator calabresa = new Calabresa(massaEspressa);
        RecheioDecorator tomate = new Tomate(massaFina);
        RecheioDecorator queijo = new Queijo(massaEspressa);
        RecheioDecorator abacaxi = new Abacaxi(massaFina);

        RecheioDecorator pizza = new Queijo(new Abacaxi(new Calabresa(new Tomate(new MassaEspressa()))));
    }
}