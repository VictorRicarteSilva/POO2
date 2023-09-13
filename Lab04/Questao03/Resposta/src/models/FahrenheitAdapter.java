package models;
import models.temperatura.*;
public class FahrenheitAdapter implements  TemperatureAdapter{
    private final FahrenheitTemperature fahrenheitTemperature;

    public FahrenheitAdapter(FahrenheitTemperature fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    public double getTemperature() {
        return fahrenheitTemperature.getFahrenheitTemperature();
    }
}
