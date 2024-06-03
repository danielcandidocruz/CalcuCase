import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Program {

    public double Program(Operacoes operacao) {
        switch (Operacoes.operacao) {
            case '+':
                return operacao.valorA + operacao.valorB;
            case '-':
                return operacao.valorA - operacao.valorB;
            case '*':
                return operacao.valorA * operacao.valorB;
            case '/':
                return operacao.valorA / operacao.valorB;

                if (operacao.valorB == 0) {
                    throw new ArithmeticException("Divisão por zero!");
                }
             
    }



    public static void main(String[] args) {
        //Pilha (Stack)
        Stack<Operacoes> pilhaOperacoes = new Stack<>(); 

        //imprimir a lista de operações após cada cálculo part1
       private  List<String> operacoesProcessadas = new ArrayList<>();

  
        pilhaOperacoes.push(new Operacoes(18, 3, '/'));
        pilhaOperacoes.push(new Operacoes(2147483647, 2, '+')); 
        pilhaOperacoes.push(new Operacoes(5, 6, '*'));
        pilhaOperacoes.push(new Operacoes(14, 8, '-'));

        Calculadora calculadora = new Calculadora();

           //Pilha (Stack)
        Stack<Operacoes> resultados = new Stack<>();


        System.out.println("Cálculos e seus resultados: ");


        //Pilha (Stack)
        while (!pilhaOperacoes.isEmpty()) {
            Operacoes operacao = pilhaOperacoes.pop();

            operacoesProcessadas.add(operacao.valorA + " " + operacao.operador + " " + operacao.valorB);



            //imprimir a lista de operações após cada cálculo part2
            try {
                operacao.resultado = calculadora.calcular(operacao);
                operacoesProcessadas.add(operacao.valorA + " " + operacao.operador + " " + operacao.valorB);
              } catch (ArithmeticException e) {
                
              }
              


                      //imprimir a lista de operações após cada cálculo part3
            System.out.println("\nOperações processadas:");
             for (String operacaoFormatada : operacoesProcessadas) {
            System.out.println(operacaoFormatada);


            System.out.println(operacao.valorA + " " + operacao.operador + " " + operacao.valorB + " = " + operacao.resultado);
            resultados.push(operacao); // Empilha o resultado (Stack)
        }





        System.out.println("\nSomente o resultado dos cálculos que foram executados acima:");


        for (Operacoes resultado : resultados) {
            System.out.println(resultado.resultado);
        }
    }
}


}


}


