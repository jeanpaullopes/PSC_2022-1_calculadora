public class Potencia extends OperacaoBinaria{


    public Potencia() {
        sinal = '^';
    }
    public double calcular() {
        double valor = operador1;
        for (int i = 2; i <= operador2; i++) {
            valor = valor * operador1;
        }
        return valor;
    }


}
