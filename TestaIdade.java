class TestaIdade {

  public static void main(String[] args) {
    // imprime a idade
    int idade = 15;
    System.out.println("Idade atual: " + idade);

    // gera uma idade no ano seguinte
    int idadeNoAnoQueVem;
    idadeNoAnoQueVem = idade + 1;

    // imprime a idade
    System.out.println("Idade no ano que vem será: " + idadeNoAnoQueVem);
    
    boolean amigoDoDono = false;
    
    if (idade < 18 && !amigoDoDono) {
      System.out.println("Não pode entrar");
    } else {
      System.out.println("Pode entrar");
    }
  }

}
