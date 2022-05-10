public class Baskara extends OperacaoTernaria{


    public Baskara() {
        sinal = 'B';
    }
    public double calcular() {
        Quadrado q = new Quadrado();
        q.setOperador1(operador2);
        double temp = (q.calcular() - (4 * operador1 * operador3));
        System.out.println(temp);
        double delta = Math.sqrt(temp);
        System.out.println("aqui vai a demonstracao ....\nasdasdasd\nasdadadsa....");
        return delta;
    }


}
