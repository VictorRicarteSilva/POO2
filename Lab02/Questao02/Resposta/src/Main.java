import models.veiculos.IVehicle;
import models.fabricante.Maker;
import models.fabricante.MakerFactory;

public class Main {
    public static void main(String[] args) {

        Maker Toyota = MakerFactory.getInstancia();
        IVehicle veiculo1 = Toyota.makeVehicle("Corolla");
        IVehicle veiculo2 = Toyota.makeVehicle("Etios");

        Maker Honda = MakerFactory.getInstancia();
        IVehicle veiculo3 = Honda.makeVehicle("City");
        IVehicle veiculo4 = Honda.makeVehicle("Civic");
        IVehicle veiculo5 = Honda.makeVehicle("Fit");

        System.out.println("Fabricante: Toyota");

        veiculo1.start();
        veiculo1.drive();
        veiculo1.stop();

        System.out.println(" ");

        veiculo2.start();
        veiculo2.drive();
        veiculo2.stop();

        System.out.println(" ");

        System.out.println("Fabricante: Honda");

        veiculo3.start();
        veiculo3.drive();
        veiculo3.stop();

        System.out.println(" ");

        veiculo4.start();
        veiculo4.drive();
        veiculo4.stop();

        System.out.println(" ");

        veiculo5.start();
        veiculo5.drive();
        veiculo5.stop();
    }
}