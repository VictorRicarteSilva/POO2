package models.fabricante;

/**
 * Aqui eu implemento meu Singleton, nele eu forneco
 * uma unica instancia da minha Factory, usando o
 * metodo getInstancia()
 */
public class MakerFactory {
    private static final Maker instancia = new Maker();
    private MakerFactory(){}

    public static Maker getInstancia(){
        return instancia;
    }
}
