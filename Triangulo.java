class Triangulo {
  public static void main (String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.print(i + " ");
      for (int j = 1; j <= i; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}
