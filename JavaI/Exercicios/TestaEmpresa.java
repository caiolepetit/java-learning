class TestaEmpresa{
	public static void main(String[] args){
		Empresa senac = new Empresa(3);

		senac.setNome("Senac");
		senac.setLogradouro("Rua Doutor Vila Nova, 123");
		senac.setCnpj("747573639");
		senac.setCidade("São Paulo");
		senac.setUf("SP");
		senac.setPais("Brasil");
		
		Funcionario caio = new Funcionario("Caio Le Petit", 10.500, "111111114");
		senac.setFuncionario(caio);

		Funcionario adriano = new Funcionario("Adriano", 2.500, "112221114");
		senac.setFuncionario(adriano);

		Funcionario jose = new Funcionario("Jose", 15.500, "11111333");
		senac.setFuncionario(jose);

		Funcionario joao = new Funcionario("Joao", 15.500, "11144333");

		senac.imprimirDadosDaEmpresa();
		System.out.println();

		senac.mostrarTodasAsInformacoes();
		System.out.println();

		System.out.println("Funcionario encontrado: "+senac.contemFuncionario(jose));
	}

}