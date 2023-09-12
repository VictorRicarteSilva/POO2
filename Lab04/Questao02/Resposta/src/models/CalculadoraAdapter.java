package models;

public class CalculadoraAdapter {
    private final CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    public int somar(int a, int b) {
        // Converter os números inteiros em representação binária
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);

        // Realizar a operação binária usando a calculadora binária existente
        String resultadoBinario = calculadoraBinaria.somar(binA, binB);

        // Converter o resultado de volta para decimal
        int resultadoDecimal = Integer.parseInt(resultadoBinario, 2);

        return resultadoDecimal;
    }

    public int subtrair(int a, int b) {
        // Converter os números inteiros em representação binária
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);

        // Realizar a operação binária usando a calculadora binária existente
        String resultadoBinario = calculadoraBinaria.subtrair(binA, binB);

        // Converter o resultado de volta para decimal
        int resultadoDecimal = Integer.parseInt(resultadoBinario, 2);

        return resultadoDecimal;
    }
}
