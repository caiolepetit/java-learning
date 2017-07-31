class Fibonacci {
  public static void main (String[] args){
    int anterior = 0;
    int atual = 1;
    System.out.println(anterior);
    while (atual < 100) {
      System.out.println(atual);
      int proximo = anterior + atual;
      anterior = atual;
      atual = proximo;
    }
    System.out.println(atual);
  }
}
