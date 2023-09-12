package models;

public class Pavao implements Ave{
    @Override
    public void voar() {
        // O pavão não pode voar.
    }

    @Override
    public void emitirSom() {
        System.out.println("Pavão cantando");
    }
}
