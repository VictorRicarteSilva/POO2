package models;

import models.temperatura.CelsiusTemperature;

public class CelsiusAdapter implements TemperatureAdapter{
    private final CelsiusTemperature celsiusTemperature;

    public CelsiusAdapter(CelsiusTemperature celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    public double getTemperature() {
        return celsiusTemperature.getCelsiusTemperature();
    }
}
