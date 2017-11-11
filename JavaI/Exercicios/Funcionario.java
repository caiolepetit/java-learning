class Funcionario {
	private String nome;
	private double salario;
	private Data dataEntradaBanco;
	private String rg;
	private static int identificador;

	public Funcionario () {
		this(null, 0.0, null);
	}

	public Funcionario (String nome, double salario, String rg) {
		this.nome = nome;
		this.salario = salario;
		this.rg = rg;
		Funcionario.identificador = Funcionario.identificador + 1;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public double getSalario(){
		return this.salario;
	}

	public void setRg(String rg){
		this.rg = rg;
	}

	public String getRg(){
		return this.rg;
	}

	public void setAumento(double aumento){
		this.salario += aumento;
	}

	public void setDataEntradaBanco(int dia, int mes, int ano){
		this.dataEntradaBanco = new Data(dia, mes, ano);
	}

	public double getGanhoAnual(){
		return  this.salario * 12;
	}

	public static int getIdentificador(){
		return Funcionario.identificador;
	}

	public void mostrar(){
		System.out.println("Matrícula: "+Funcionario.getIdentificador());
		System.out.println("Nome funcionário: "+this.nome);
		System.out.println("Salário: "+this.salario);
		System.out.println("Data de entrada no banco: "+dataEntradaBanco.getFormatada());
		System.out.println("RG: "+this.rg);
		System.out.println("Ganho anual: "+getGanhoAnual());
	}
}