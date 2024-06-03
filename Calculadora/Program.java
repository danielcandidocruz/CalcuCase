import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Program {

    public static void main(String[] args) throws Exception{
        // Pilha (Stack)
        Stack<Operacoes> pilhaOperacoes = new Stack<>();

        // imprimir a lista de operações após cada cálculo part1
        List<String> operacoesProcessadas = new ArrayList<>();

        pilhaOperacoes.push(new Operacoes(14, 8, '-'));
        pilhaOperacoes.push(new Operacoes(5, 6, '*'));
        pilhaOperacoes.push(new Operacoes(2147483647, 2, '+'));
        pilhaOperacoes.push(new Operacoes(18, 3, '/'));

        Calculadora calculadora = new Calculadora();

        // Pilha (Stack)
        Stack<Operacoes> resultados = new Stack<>();

        System.out.println("Cálculos e seus resultados: ");

        // Pilha (Stack)
        while (!pilhaOperacoes.isEmpty()) {
            Operacoes operacao = pilhaOperacoes.pop();

            // imprimir a lista de operações após cada cálculo part2
            double resultado = calculadora.calcular(operacao);
            operacao.setResultado(resultado);

            operacoesProcessadas.add(operacao.getValorA() + " " + operacao.getOperador() + " " + operacao.getValorB());

            // imprimir a lista de operações após cada cálculo part3
            if(pilhaOperacoes.isEmpty()){
                System.out.println("Não existem operações a serem processadas.");
            }else{
                System.out.println("Operações a serem processadas: " + pilhaOperacoes.toString());
            }

            resultados.push(operacao); // Empilha o resultado (Stack)
        }

        System.out.println("\nSomente o resultado dos cálculos que foram executados acima:");
        resultados.forEach(r -> System.out.println(r.getResultado()));
    }

}