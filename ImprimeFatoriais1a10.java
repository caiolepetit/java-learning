class ImprimeFatoriais1a10 {
  public static void main (String[] args) {
    for (int i = 1; i <= 20; i++) {
      long fatorial = 1;
      for (int j = 1; j <= i; j++) {
        fatorial *= j;
      }
      System.out.println("A fatorial de " + i + " é " + fatorial); 
    }
  }
}
