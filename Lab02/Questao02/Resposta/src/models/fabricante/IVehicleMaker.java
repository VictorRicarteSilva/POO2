package models.fabricante;
import models.veiculos.IVehicle;

public interface IVehicleMaker {
    IVehicle makeVehicle(String modelo);
}
