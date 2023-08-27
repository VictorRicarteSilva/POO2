package models.fabricante;

import models.celular.Celular;
import models.celular.Modelo;

public class FabricaCelular implements  FabricanteCelular{
    @Override
    public Celular constroiCelular(String modelo) {
        return new Modelo(modelo);
    }
}
