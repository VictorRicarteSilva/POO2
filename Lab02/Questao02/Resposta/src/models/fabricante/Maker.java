package models.fabricante;

import models.veiculos.IVehicle;
import models.veiculos.VehicleModels;

/**
 * Essa é a minha Factory de veiculos nela eu gero novas
 * instancias de veiculos.
 */
public class Maker implements  IVehicleMaker{
    @Override
    public IVehicle makeVehicle(String modelo) {
        return new VehicleModels(modelo) {
        };
    }
}
