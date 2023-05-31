package empresa;

//não pode instanciar dessa classe porque é abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	// método abstrato não tem implementação, quem irá implementar será a classe
	// filha
	public abstract double getBonificacao();

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nSalário: " + salario;
	}

}
