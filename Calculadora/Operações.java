public class Operacoes {

    private int valorA;
    private char operador;
    private int valorB;
    private double resultado;

    public Operacoes( int valorA, int valorB, char operador) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.operador = operador;
    }
    
    public int getValorA() {
        return valorA;
    }

   
    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

  
    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    public double getResultado(){
        return resultado;
    }

    public void setResultado(double resultado){
        this.resultado = resultado;
    }

    @Override
    public String toString(){
        return "Valor A: " + valorA + "\n"
            + "Valor B: " + valorB + "\n"
            + "Operacao: " + operador + "\n";
    }
}