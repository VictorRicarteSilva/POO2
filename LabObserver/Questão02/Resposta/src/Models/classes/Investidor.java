package Models.classes;

import Models.interfaces.Observer;

public class Investidor implements Observer {
    private final String nome;

    public Investidor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Acao acao) {
        System.out.println(nome + " recebeu uma notificação de que o preço da ação " + acao.getNome() + " está agora em " + acao.getPrecoAtual() + ".");
    }
}
