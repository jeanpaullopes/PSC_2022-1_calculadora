import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {

    private double valor1;
    private double valor2;
    private double valor3;
    private Operacao operacaoAtual;
    private Scanner scanner;
    private List<Operacao> operacoes;

    public Calculadora() {
        scanner = new Scanner(System.in);

        operacoes = new ArrayList();
        operacoes.add( new Multiplicacao() );
        operacoes.add( new Soma() );
        operacoes.add( new Subtracao() );
        operacoes.add(new Quadrado());
        operacoes.add(new Potencia());
        operacoes.add(new Baskara());

    }

    public void rodar() {
        obterValor1();
        selecionarOperacao();
        if (precisaSegundoOperador()) {
            obterValor2();
        }
        if (precisaTerceiroOperador()) {
            obterValor3();
        }
        obterResultado();
    }
    public void obterValor1() {
        System.out.println("informe o 1º valor:");
        valor1 = scanner.nextDouble();
    }
    public void obterValor2() {
        System.out.println("informe o 2º valor:");
        valor2 = scanner.nextDouble();
    }
    public void obterValor3() {
        System.out.println("informe o 3º valor:");
        valor3 = scanner.nextDouble();
    }
    public void selecionarOperacao() {
        System.out.println("informe a operação:\n");
        for (int i = 0; i < operacoes.size(); i++) {
            System.out.println(operacoes.get(i).getSinal());
        }
        String op = scanner.next();
        char operacao = op.charAt(0);
        for (int i = 0; i < operacoes.size(); i++) {
            if (operacoes.get(i).getSinal() == operacao) {
                operacaoAtual = operacoes.get(i);
            }
        }
        //System.out.println("operacao tem => "+operacao);

    }

    public boolean precisaSegundoOperador() {
        if (operacaoAtual instanceof OperacaoBinaria){// || operacaoAtual instanceof OperacaoTernaria) {
            return true;
        } else {
            return false;
        }
    }
    public boolean precisaTerceiroOperador() {
        if (operacaoAtual instanceof OperacaoTernaria) {
            return true;
        } else {
            return false;
        }
    }
    public void obterResultado() {

        /*
        Operacao chiquinho = null;
        int i = 0;

        if(operacao == '+') {
            i = 0;//chiquinho = objSoma;
        }
        if(operacao == '-') {
            i = 1; //chiquinho = objSubtracao;
        }
        if(operacao == '*') {
            i = 2; //chiquinho = objMultiplicao;
        }

        chiquinho = operacoes.get(i);
        for (int i = 0; i < operacoes.size(); i++) {
            if (operacoes.get(i).getSinal() == operacao) {
                chiquinho = operacoes.get(i);
            }
        }
         */


        operacaoAtual.setOperador1(valor1);
        if (precisaSegundoOperador() ) {
            ((OperacaoBinaria) operacaoAtual).setOperador2(valor2);
        }
        if (precisaTerceiroOperador() ) {
            ((OperacaoTernaria) operacaoAtual).setOperador3(valor3);
        }
        System.out.println("Resultado => "+operacaoAtual.calcular());

        /*
        if(operacao == '+') {
            objSoma.setOperador1(valor1);
            objSoma.setOperador2(valor2);
            System.out.println("Resultado => "+objSoma.calcular());
        }
        if (operacao == '-') {
            objSubtracao.setOperador1(valor1);
            objSubtracao.setOperador2(valor2);
            System.out.println("Resultado => "+objSubtracao.calcular());
        }
        if (operacao == '*') {
            objMultiplicao.setOperador1(valor1);
            objMultiplicao.setOperador2(valor2);
            System.out.println("Resultado => "+objMultiplicao.calcular());
        }
        if (operacao == '/') {

        }

         */
    }
}
