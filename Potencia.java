class Potencia extends Operacao {
  float v1 = 0;
  float v2 = 0;

  public Potencia() {
    sinal = '^';
    qtdValores = 1;
  }
  
  
  // sobrecarga - dois métodos com o mesmo nome
  // e assinaturas diferentes
  public float elevar(float op1, float op2) {
    return op1 * op2;
  }
  @Override
  public float calcular(float v1, float v2) {
    return elevar(v1, v1);
  }
}