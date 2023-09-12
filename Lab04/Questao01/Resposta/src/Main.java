import models.*;
import models.adapter.AdapterPavao;

public class Main {
    public static void main(String[] args) {
        Ave pato = new Pato();
        Ave pavao = new AdapterPavao(new Pavao());

        System.out.println("Pato:");
        pato.voar();
        pato.emitirSom();

        System.out.println("\nPavão:");
        pavao.voar(); // O Adapter permite que o pavão "voe" usando o método emitirSom()
    }
}