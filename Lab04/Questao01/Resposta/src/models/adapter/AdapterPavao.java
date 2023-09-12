package models.adapter;
import models.*;
public class AdapterPavao implements Ave{
    private Pavao pavao;

    public AdapterPavao(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        // Adaptando o pavão para voar usando o método emitirSom()
        System.out.println("Pavão voando (adaptado)");
        pavao.emitirSom();
    }

    @Override
    public void emitirSom() {
        // Delega a chamada ao método emitirSom() do pavão
        pavao.emitirSom();
    }
}
