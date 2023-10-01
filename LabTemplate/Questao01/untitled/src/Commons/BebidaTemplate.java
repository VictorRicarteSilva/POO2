package Commons;

public abstract class BebidaTemplate {
    public void aqueceAgua(){
        System.out.println("Agua aquecida!");
    }

    public void colocaNaXicara(){
        System.out.println("Bebida envasada!");
    }
    public abstract void preparaBebida();

    public abstract void adicionaCondimentos();
}
