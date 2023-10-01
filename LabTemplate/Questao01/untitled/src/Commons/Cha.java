package Commons;

public class Cha extends BebidaTemplate{
    @Override
    public void preparaBebida() {
        System.out.println("Sache submerso na agua quente...");
    }

    @Override
    public void adicionaCondimentos() {
        System.out.println("Adiciona adocante.");
    }
}
