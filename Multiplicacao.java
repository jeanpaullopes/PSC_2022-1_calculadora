class Multiplicacao extends Operacao {
  float v1 = 0;
  float v2 = 0;

  public Multiplicacao(){
    sinal = '*';
  }
  public float multiplicar() {
    return v1 * v2;
    
  }
  // sobrecarga - dois métodos com o mesmo nome
  // e assinaturas diferentes
  public float multiplicar(float op1, float op2) {
    return op1 * op2;
  }
  @Override
  public float calcular(float v1, float v2) {
    return multiplicar(v1, v2);
  }
}