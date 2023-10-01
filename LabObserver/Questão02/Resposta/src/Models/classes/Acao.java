package Models.classes;

import Models.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Acao implements Subject {
    private final String nome;
    private double precoAtual;
    private final List<Observer> investidores = new ArrayList<>();
    private Double precoMaximo;
    private Double precoMinimo;

    public Acao(String nome, double precoInicial) {
        this.nome = nome;
        this.precoAtual = precoInicial;
    }

    @Override
    public void registerObserver(Observer observer) {
        investidores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        investidores.remove(observer);
    }

    public void setPreco(double novoPreco) {
        this.precoAtual = novoPreco;
        notifyObservers();
    }

    public void setLimites(double precoMinimo, double precoMaximo) {
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
    }

    @Override
    public void notifyObservers() {
        for (Observer investidor : investidores) {
            investidor.update(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }
}