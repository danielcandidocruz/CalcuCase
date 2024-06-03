import java.util.InputMismatchException;

public class Calculadora {

    public double calcular(Operacoes operacao) {
        validarEntrada(operacao);

        switch (Operacoes.operacao) {
            case '+':
                return soma(operacao.valorA, operacao.valorB);
            case '-':
                return subtracao(operacao.valorA, operacao.valorB);
            case '*':
                return multiplicacao(operacao.valorA, operacao.valorB);
                case '/':
                return divisao(operacao.valorA, operacao.valorB);
            default:
                throw new IllegalArgumentException("Operador inválido: " + operacao.operador);


        }
    }




    
    private void validarEntrada(Operacoes operacao) {
        if (!isNumero(operacao.valorA) || !isNumero(operacao.valorB)) {
            throw new InputMismatchException("Valores inválidos: " + operacao.valorA + " e " + operacao.valorB);
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