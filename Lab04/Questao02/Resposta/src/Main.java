import models.CalculadoraAdapter;
import models.CalculadoraBinaria;

public class Main {
    public static void main(String[] args) {
        // Criar uma instância da calculadora binária existente
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();

        // Criar uma instância do adaptador
        CalculadoraAdapter calculadoraAdapter = new CalculadoraAdapter(calculadoraBinaria);

        // Executar operações com números inteiros usando o adaptador
        int resultadoSoma = calculadoraAdapter.somar(10, 5);
        int resultadoSubtracao = calculadoraAdapter.subtrair(20, 8);

        // Exibir resultados
        System.out.println("Resultado da Soma: " + resultadoSoma);
        System.out.println("Resultado da Subtração: " + resultadoSubtracao);
    }
}