class Divisao extends Operacao {
  float v1 = 0;
  float v2 = 0;

  public Divisao() {
    sinal = '/';
  }
  
  
  // sobrecarga - dois métodos com o mesmo nome
  // e assinaturas diferentes
  public float dividir(float op1, float op2) {
    return op1 / op2;
  }
  @Override
  public float calcular(float v1, float v2) {
    return dividir(v1, v2);
  }
}