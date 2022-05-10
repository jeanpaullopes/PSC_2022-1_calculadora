public abstract class Operacao {

    protected double operador1;

    protected char sinal;


    public double calcular() {
        return 0f;
    }

    public void setOperador1(double operador1) {
        this.operador1 = operador1;
    }

    public char getSinal() {
        return sinal;
    }
}
