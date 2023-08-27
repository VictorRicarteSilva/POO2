package models.fabricante;

public class FabricanteCelularFactory {
    private static final FabricanteCelular instancia = new FabricaCelular();

    private FabricanteCelularFactory() {
    }

    public static FabricanteCelular getInstancia() {
        return instancia;
    }
}
