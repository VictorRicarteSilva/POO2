package models.temperatura;

public class FahrenheitTemperature {
    private final double temperature;

    public FahrenheitTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFahrenheitTemperature() {
        return temperature;
    }
}
