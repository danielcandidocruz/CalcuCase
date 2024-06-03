import java.util.InputMismatchException;

public class Calculadora {

    public double calcular(Operacoes operacao) {
        validarEntrada(operacao);

        switch (operacao.getOperador()) {
            case '+':
                return soma(operacao.getValorA(), operacao.getValorB());
            case '-':
                return subtracao(operacao.getValorA(), operacao.getValorB());
            case '*':
                return multiplicacao(operacao.getValorA(), operacao.getValorB());
            case '/':
                return divisao(operacao.getValorA(), operacao.getValorB());
            default:
                throw new IllegalArgumentException("Operador inválido: " + operacao.getOperador());
        }
    }
    
    private void validarEntrada(Operacoes operacao) {
        if (!isNumero(operacao.getValorA()) || !isNumero(operacao.getValorB())) {
            throw new InputMismatchException("Valores inválidos: " + operacao.getValorA() + " e " + operacao.getValorB());
        }
    }

    private boolean isNumero(double valor) {
        return !Double.isNaN(valor) && !Double.isInfinite(valor);
    }

    private double soma(double valorA, double valorB) {
        return valorA + valorB;
    }

    private double subtracao(double valorA, double valorB) {
        return valorA - valorB;
    }

    private double multiplicacao(double valorA, double valorB) {
        return valorA * valorB;
    }

    private double divisao(double valorA, double valorB) {
        return valorA / valorB;
    }
}