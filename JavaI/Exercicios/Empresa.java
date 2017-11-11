public class Empresa {
	private int membro = 0;
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private String logradouro;
	private String cidade;
	private String uf;
	private String pais;

	public Empresa (int tamanhoArray){
		this.funcionarios = new Funcionario[tamanhoArray];
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

	public void setFuncionario(Funcionario f){
		this.funcionarios[membro] = f;
		membro++;
	}

	public void getFuncionario(Funcionario funcionario){
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Salário: "+funcionario.getSalario());
		System.out.println("RG: "+funcionario.getRg());
		System.out.println("------------------------");
	}

	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public void setUf(String uf){
		this.uf = uf;
	}

	public void setPais(String pais){
		this.pais = pais;
	}

	public void imprimirDadosDaEmpresa(){
		System.out.println("Nome da empresa: "+this.nome);
		System.out.println("CNPJ: "+this.cnpj);
		System.out.println("Logradouro: "+logradouro);
		System.out.println("Cidade: "+this.cidade);
		System.out.println("UF: "+this.uf);
		System.out.println("País: "+this.pais);
	}

	public void mostrarTodasAsInformacoes(){
		System.out.println("*** Relação dos funcionarios ***");
		System.out.println();
		for (Funcionario funcionario : funcionarios) {
			if (funcionario != null) {
				getFuncionario(funcionario);
			}
		}
	}

	public boolean contemFuncionario(Funcionario funcionarioProcurado){
		for (Funcionario funcionario : funcionarios) {
			if (funcionarioProcurado == funcionario) {
				return true;
			}
		}
		return false;
	}
}