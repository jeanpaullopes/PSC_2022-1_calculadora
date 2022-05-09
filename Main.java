
import java.util.Scanner;


class Main {
  static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    Calculadora calc =  new Calculadora();
    calc.rodar();
    //String nome = scanner.nextLine();
    //System.out.println("olá "+nome);
    /*
    System.out.println("informe 1o valor:");
    float v1 = scanner.nextFloat();
    float resultado = 0;
    while (true) {
      char operacao = menu();
      System.out.println("informe 2o valor:");
      float v2 = scanner.nextFloat();
      if (operacao == '+') {
        resultado = soma(v1, v2);
      }
      if (operacao == '-') {
        resultado =  subtracao(v1, v2);
      }
      if (operacao == '*') {
        resultado =  multiplicacao(v1, v2);
      }
      if (operacao == '/') {
        resultado =  divisao(v1, v2);
      }
      System.out.println(" = "+ resultado);
      v1 = resultado;
    }
    */
  }
/*
  public static float soma(float op1, float op2) {
    return op1 + op2;
  }
  public static float subtracao(float op1, float op2) {
    return op1 - op2;
  }
  public static float multiplicacao(float op1, float op2) {
    return op1 * op2;
  }
  public static float divisao(float op1, float op2) {
    return op1 / op2;
  }
  public static char menu() {
    System.out.println("+ adição");
    System.out.println("- subtração");
    System.out.println("* multiplicação");
    System.out.println("/ divisão");
    System.out.println("informe a operação:");
    String op = scanner.next();
    return op.charAt(0);
    
    
  }
  */
}