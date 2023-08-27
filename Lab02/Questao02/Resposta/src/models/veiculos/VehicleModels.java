package models.veiculos;

public class VehicleModels implements  IVehicle{

    private final String model;

    public VehicleModels(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " - Dando partida!");
    }

    @Override
    public void drive() {
        System.out.println(model + " - Em movimento!");
    }

    @Override
    public void stop() {
        System.out.println(model + " - Desligando o motor!");
    }
}
