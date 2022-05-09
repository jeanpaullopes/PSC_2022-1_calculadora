import java.util.Scanner;

class Calculadora {
  
  Scanner scanner = new Scanner(System.in);
  Operacao[] operacoes;
  int TAM = 5;
  //Operacao objSoma;
  //Operacao objSub;
  //Operacao objMulti;

  public Calculadora() {
    operacoes = new Operacao[TAM];
    operacoes[0] = new Soma();
    operacoes[1] = new Subtracao();
    operacoes[2] = new Multiplicacao();
    operacoes[3] = new Divisao();
    operacoes[4] = new Potencia();
  }

  public void rodar() {
    System.out.println("informe 1o valor:");
    float v1 = scanner.nextFloat();
    float resultado = 0;
    while (true) {
      char operacao = menu();
      float v2 = 0;
      int indexOp = 0;
       for (int i =0; i < TAM; i++) {
        System.out.println("no for i="+i+"  sinal = "+operacoes[i].sinal);
        if (operacoes[i].sinal == operacao) {
          indexOp = i;
        }
      }
      if (operacoes[indexOp].qtdValores >= 2) {
        System.out.println("informe 2o valor:");
        v2 = scanner.nextFloat();

        }
      /*
      if (operacao == '+') {
        indexOp = 0;
        //objSoma.ola();
        //resultado = objSoma.calcular(v1, v2);
      }
      
      if (operacao == '-') {
        indexOp = 1;
        //resultado =  objSub.calcular(v1, v2);
      }
      if (operacao == '*') {
        indexOp = 2;
        //resultado =  objMulti.calcular(v1, v2);
      }
      if (operacao == '/') {
        indexOp = 3;
      }
      if (operacao == '^') {
        indexOp = 4;
        }
*/
      resultado =  operacoes[indexOp].calcular(v1, v2);
      /*
      if (operacao == '/') {
        resultado =  divisao(v1, v2);
      }
      */
      limpaTela();
      System.out.println(" = "+ resultado);
      v1 = resultado;
    }
  }
  
  public char menu() {
    for (int i =0; i < TAM; i++) {
      System.out.println(operacoes[i].sinal+"");
    }
    //System.out.println("+ adição");
    //System.out.println("- subtração");
    //System.out.println("* multiplicação");
    //System.out.println("/ divisão");
    System.out.println("informe a operação:");
    String op = scanner.next();
    return op.charAt(0);
    
    
  }

  public void limpaTela() {
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }
}