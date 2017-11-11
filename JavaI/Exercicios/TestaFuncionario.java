class TestaFuncionario {
	public static void main (String[] args){
		
		Funcionario daenerys = new Funcionario ("Daenerys Targaryen", 10.500, "151515151");
		//daenerys.mostrar();

		Funcionario caio = new Funcionario();

		caio.setNome("Caio Le Petit");
		caio.setSalario(3000.00);
		caio.setDataEntradaBanco(31,02,2017);
		caio.setRg("11.111.111-2");
		
		System.out.println("---- Antes de aumento ----");
		caio.mostrar();

		caio.setAumento(500.00);

		System.out.println();
		System.out.println("---- Depois do aumento ----");
		caio.mostrar();


		Funcionario danilo = new Funcionario();

		danilo.setNome("Danilo Pereira");
		danilo.setSalario(3000.00);
		danilo.setDataEntradaBanco(13,4,2020);
		danilo.setRg("11.111.111-2");

		System.out.println();
		System.out.println("---- Danilo ----");
		danilo.mostrar();

		System.out.println();
		System.out.println("---- Iguais? ----");
		if (caio == danilo) {
			System.out.println("São iguais.");
		} else {
			System.out.println("São diferentes.");
		}
	}
}