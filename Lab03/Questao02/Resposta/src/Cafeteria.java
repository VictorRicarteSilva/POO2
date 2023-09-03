import cafe.Cafe;
import cafe.espresso.Espresso;
import cafe.descafeinado.Decaf;
import ingredientes.canela.Canela;
import ingredientes.chocolate.Chocolate;
import ingredientes.leite.Leite;

public class Cafeteria {
    public static void main(String[] args) {
// Preparar um Espresso com Leite e Canela
        Cafe bebida1 = new Canela(new Leite(new Espresso()));
        System.out.println("Bebida 1: " + bebida1.getDescricao() + " - Custo: $" + bebida1.calculaCusto());

        // Preparar um Decaf com Leite e Chocolate
        Cafe bebida2 = new Chocolate(new Leite(new Decaf()));
        System.out.println("Bebida 2: " + bebida2.getDescricao() + " - Custo: $" + bebida2.calculaCusto());

    }
}