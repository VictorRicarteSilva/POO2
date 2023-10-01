import Models.classes.Acao;
import Models.classes.Investidor;

public class Main {
    public static void main(String[] args) {
        Acao acao1 = new Acao("Acao1", 100.0);
        Acao acao2 = new Acao("Acao2", 50.0);

        Investidor investidor1 = new Investidor("Investidor1");
        Investidor investidor2 = new Investidor("Investidor2");

        acao1.registerObserver(investidor1);
        acao2.registerObserver(investidor2);

        acao1.setLimites(90.0, 120.0);
        acao2.setLimites(40.0, 60.0);

        acao1.setPreco(110.0);
        acao2.setPreco(45.0);
    }
}