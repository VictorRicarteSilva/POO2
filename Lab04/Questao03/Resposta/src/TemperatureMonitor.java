import models.*;
import models.temperatura.CelsiusTemperature;
import models.temperatura.FahrenheitTemperature;

public class TemperatureMonitor {
    public static void main(String[] args) {
        // Medir a temperatura em Celsius (°C)
        CelsiusTemperature celsiusTemp = new CelsiusTemperature(25.0);
        TemperatureAdapter celsiusAdapter = new CelsiusAdapter(celsiusTemp);
        System.out.println("Temperatura em Celsius: " + celsiusAdapter.getTemperature() + "°C");

        // Medir a temperatura em Fahrenheit (°F)
        FahrenheitTemperature fahrenheitTemp = new FahrenheitTemperature(77.0);
        TemperatureAdapter fahrenheitAdapter = new FahrenheitAdapter(fahrenheitTemp);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheitAdapter.getTemperature() + "°F");
    }
}