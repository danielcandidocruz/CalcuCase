
public class Operacoes {

    private int valorA;
    private char operador;
    private int valorB;
    private int resultado;



    public Operacoes( int valorA; int valorB; char operador; double resultado) {

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

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}