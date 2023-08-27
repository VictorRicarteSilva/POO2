package models.celular;

public class Modelo implements Celular{
    private final String modelo;

    public Modelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void fazLigacao() {
        System.out.println(modelo + " - Fazendo ligação...");
    }

    @Override
    public void tiraFoto() {
        System.out.println(modelo + " - Tirando foto...");
    }
}
