import models.celular.Celular;
import models.fabricante.FabricanteCelular;
import models.fabricante.FabricanteCelularFactory;

public class Main {
    public static void main(String[] args) {

        FabricanteCelular fabricante = FabricanteCelularFactory.getInstancia();

        Celular celular1 = fabricante.constroiCelular("Galaxy8");
        Celular celular2 = fabricante.constroiCelular("IPhoneX");

        celular1.fazLigacao();
        celular1.tiraFoto();

        celular2.fazLigacao();
        celular2.tiraFoto();
    }
}
