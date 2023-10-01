package Commons;

public class Cafe extends BebidaTemplate{
    @Override
    public void preparaBebida() {
        System.out.println("Coa cafe...");
    }

    @Override
    public void adicionaCondimentos() {
        System.out.println("Adiciona açúcar \n Adiciona canela.");
    }
}
