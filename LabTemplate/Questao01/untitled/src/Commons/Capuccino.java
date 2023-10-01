package Commons;

public class Capuccino extends BebidaTemplate{
    @Override
    public void preparaBebida() {
        System.out.println("Moe o cafe \n liga a cafeteira.");
    }

    @Override
    public void adicionaCondimentos() {
        System.out.println("Adciona açúcar \n Adciona baunilha.");
    }
}
